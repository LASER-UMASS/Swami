#!/bin/bash
for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i; done &> out;

echo "Total Tests:"
grep " Test" out | wc -l
echo "Good Tests:"
grep "Good Test" out | wc -l
echo "Bad/Failed Tests:"
grep "Bad Test" out | wc -l
echo "OK Tests:"
grep "OK Test" out | wc -l

#echo "Good Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Good Test" | wc -l; done;

#echo "Bad Tests per test file"
#for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i | grep "Bad Test" | wc -l; done;

echo "Manual analysis of Bad tests reveals that the Bad tests of test_get_arraybuffer_prototype_bytelength file
are actually failed tests while remanining ones are false alarms"

good=$(( 31381 + 998 ))
bad=$(( 1533 - 998 ))
noninnocuous=$(( 31381 + 1533 ))
innocuous=$(( 83000 - $noninnocuous ))
echo $good, $bad, $noninnocuous, $innocuous

echo "Good Fraction (out of non-innocous):"
bc <<< "scale=4; 32379/32914"
echo "Bad Fraction (out of non-innocous):"
bc <<< "scale=4; 535/32914"

echo "Good Fraction (out of total):"
bc <<< "scale=4; 32379/83000"
echo "Bad Fraction (out of total):"
bc <<< "scale=4; 535/83000"
