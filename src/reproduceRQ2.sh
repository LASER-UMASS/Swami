#!/bin/bash

echo
echo "STEP1: Generate Templates for extracted Relevant sections for Rhino"
echo
rm -rf ../results/Rhino_ECMA262_Tests/
python3 swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTemplates rhino 1000

echo
echo "STEP2: Instantiate generated Templates for Rhino"
echo
rm -rf ../results/Rhino_ECMA262_Tests/
python3 swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTests rhino 1000

echo
echo "STEP3: Run Developer-written, Swami-generated, and Developer-written augmented with Swami tests in Rhino"
echo
./runTestsInRhino.sh

echo
echo "STEP4: compare code coverage of Developer-written, with Developer-written augmented with Swami tests in Rhino"
echo
./compareCoverageDeveloper.sh

echo
echo "Identifying the difference in the method-level coverage for the 8 Rhino classes for which change in coverage is observed"
./coverageAnalysisDeveloper.sh
