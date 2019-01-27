#!/bin/bash

echo "STEP1: Extract Relevant sections"
echo
rm -rf ../results//Node_ECMA262_Tests/
python3 swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ getRelSections node 1000

echo
echo "STEP2: Generate Templates for extracted Relevant sections Node.js"
echo
rm -rf ../results//Node_ECMA262_Tests/
python3 swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTemplates node 1000

echo
echo "STEP3: Instantiate generated Templates for Node.js"
echo
rm -rf ../results/Node_ECMA262_Tests/
python3 swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTests node 1000
echo "Total #tests generated: 83000"

echo
echo "STEP4: Run and analyse generated Tests on Node.js"
echo
./analyzeGeneratedTests.sh

