#!/bin/bash
for i in ../results/Node_ECMA262_Tests/*.js;do echo $i; ~/node-10.7.0/node $i; done &> out;

echo "Total Tests:"
grep " Test" out | wc -l
echo "Good Tests:"
grep "Good Test" out | wc -l
echo "Bad Tests:"
grep "Bad Test" out | wc -l
echo "OK Tests:"
grep "OK Test" out | wc -l

