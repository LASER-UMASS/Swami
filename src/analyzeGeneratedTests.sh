#!/bin/bash

if [ -f rq1_output.txt ]; then
    rm rq1_output.txt
fi

for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i; done &>> rq1_output.txt;

echo
echo "Total #tests generated: $(grep " Test" rq1_output.txt | wc -l)"
echo "#Good tests: $(grep "Good Test" rq1_output.txt | wc -l)"
echo "#Bad/Failing tests: $(grep "Bad Test" rq1_output.txt | wc -l)"
echo "#OK tests: $(grep "OK Test" rq1_output.txt | wc -l)"
echo

#echo "Good Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Good Test" | wc -l; done;

#echo "Bad Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Bad Test" | wc -l; done;

echo
echo "Manual analysis of 998 Bad/Failing tests of test-get-arraybuffer-prototype-bytelength.js test file reveal that these are actually failing tests (hence Good tests) while remaining ones are false alarms. Thus, the revised number of Good, Bad, Innocuous, and Non-innocuous tests is:"
echo
good=$(( 31381 + 998 ))
bad=$(( 1533 - 998 ))
noninnocuous=$(( 31381 + 1533 ))
innocuous=$(( 83000 - $noninnocuous ))
echo
echo "######### REPLICATING RESULTS REPORTED FOR RQ1 ###############"
echo
echo "#Good tests= 31381 + 998 =  $good"
echo "#Bad tests: 1533 - 998 = $bad"
echo "#Non-innocuous tests: 31381 + 1533 = $noninnocuous"
echo "#Innocuous tests: 83000 - 31381 - 1533 = $innocuous"
echo
echo "Percent of Good tests (out of non-innocuous): $(bc <<< "scale=2; 3237900/32914")%"
echo "Percent of Bad tests (out of non-innocuous): $(bc <<< "scale=2; 53500/32914")%"
echo "Percent of Good tests (out of total): $(bc <<< "scale=2; 3237900/83000")%"
echo "Fraction of Bad tests (out of total): $(bc <<< "scale=2; 53500/83000")%"
echo
echo "####################################################################"
echo
