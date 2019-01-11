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
echo "STEP3: Execute EvoSuite-generated test suites in Rhino"
echo
./runEvoSuiteTestsInRhino.sh

echo
echo "STEP4: compare code coverage of EvoSuite-generated, with EvoSuite-generated augmented with Swami tests in Rhino"
echo
./compareCoverageEvoSuite.sh

