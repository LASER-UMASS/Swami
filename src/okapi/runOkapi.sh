# script to use IR model (OKAPI) to identify the relevant (encode testable behavior) sections
# of ECMA-262_v8 specification document

cd /home/swami/BLUiR-Package/BLUiR
echo "Represent each section of the document as a query"
rm ../Output/query
java -jar BLUiR.jar -task=createquery -bugRepoLocation=/home/swami/swami/data/ECMA-262_v8.xml -queryFilePath=../Output/query
echo "Process Rhino v1.7.9 source code to create documents"
rm -rf ../Output/docs
java -jar BLUiR.jar -task=createdocs -codeLocation=/home/swami/rhino-Rhino1_7_9_Release/src/org/ -docLocation=../Output/docs
echo "Create index from the documents"
rm -rf ../Output/index
java -jar BLUiR.jar -task=index -indexLocation=../Output/index -docLocation=../Output/docs
echo "Running OKAPI model to identify the most relevant Java class (document) for each section (query)"
/home/swami/indri-5.3/runquery/IndriRunQuery ../Output/query  -count=1 -index=../Output/index  -trecFormat=true -rule=method:okapi,k1:0.7,b:0.0,k3=1000 > spec_class_mappings_top1.txt
echo "Filter out mappings for which the similarity score is below threshold"
python /home/swami/swami/src/okapi/filterBasedOnThreshold.py /home/swami/BLUiR-Package/BLUiR/spec_class_mappings_top1.txt > /home/swami/swami/results/spec_class_mappings_top1.txt
echo "Identified mappings are available in file /home/swami/swami/results/spec_class_mappings_top1.txt"
echo "Extracting section IDs from the identified mappings"
cat /home/swami/swami/results/spec_class_mappings_top1.txt | cut -d ' ' -f 1 > /home/swami/swami/results/retrieved_sections_ecma262_v8.txt
echo "The relevant sections retrieved using OKAPI model are available in file /home/swami/swami/results/retrieved_sections_ecma262_v8.txt"
echo "Computing Precision and Recall"
python /home/swami/swami/src/okapi/computePrecisionRecall.py /home/swami/swami/data/relevant_sections_ecma262_v8.txt /home/swami/swami/results/retrieved_sections_ecma262_v8.txt
