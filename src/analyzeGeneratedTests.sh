#!/bin/bash

if [ -f rq1_output.txt ]; then
    rm rq1_output.txt
fi

for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i; done &>> rq1_output.txt;

innocuoustestcount=$(grep "OK Test" rq1_output.txt | wc -l)
passingtestcount=$(grep "Good Test" rq1_output.txt | wc -l) 
failingtestcount=$(grep "Bad Test" rq1_output.txt | wc -l)

echo
echo "Total #tests generated: $(grep " Test" rq1_output.txt | wc -l)"
echo "#Innocuous tests: $innocuoustestcount" 
echo "#Non-Innocuous tests: $((passingtestcount + failingtestcount))" 
echo

#echo "Good Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Good Test" | wc -l; done;

#echo "Bad Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Bad Test" | wc -l; done;

echo
echo "#failing tests: $failingtestcount" 
echo "Manual analysis of $failingtestcount failing tests to identify false alarms reveals"
echo "that 998 tests of test-get-arraybuffer-prototype-bytelength.js test file are not"
echo "false alarms and expose a bug in the implementation of ArrayBuffer.byteLength." 
echo "The remaining 532 tests are false alarms caused because of the existing overloaded methods"

echo
goodtestcount=$((passingtestcount + 998))
badtestcount=$((failingtestcount - 998 ))
echo "#Good tests: $goodtestcount"
echo "#Bad tests: $badtestcount"
echo
echo "Percent of Good tests (out of total): $(bc <<< "scale=2; 3237900/83000")%"
echo "Percent of Bad tests (out of total): $(bc <<< "scale=2; 53500/83000")%"
echo "Percent of Innocuous tests (out of total): $(bc <<< "scale=2; 5008600/83000")%"
echo
echo "Percent of Good tests (out of non-innocuous): $(bc <<< "scale=2; 3237900/32914")%"
#echo "Percent of Bad tests (out of non-innocuous): $(bc <<< "scale=2; 53500/32914")%"
echo "####################################################################"
echo
