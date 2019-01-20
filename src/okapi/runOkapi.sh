

cd /home/swami/BLUiR-Package/BLUiR

java -jar BLUiR.jar -task=createquery -bugRepoLocation=/home/swami/swami/src/okapi/ecma-262-v3-rel_sections.xml -queryFilePath=../Output/query

java -jar BLUiR.jar -task=createdocs -codeLocation=/home/swami/rhino-Rhino1_7_9_Release/src/org/ -docLocation=../Output/docs

java -jar BLUiR.jar -task=index -indexLocation=../Output/index -docLocation=../Output/docs

/home/swami/indri-5.3/runquery/IndriRunQuery ../Output/query  -count=1 -index=../Output/index  -trecFormat=true -rule=method:okapi,k1:1000.0,b:0.0,k3=1000 > spec_class_mappings.txt
