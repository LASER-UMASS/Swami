#!/bin/bash

echo "STEP1: Extract Relevant sections"
rm -rf ../results/*
python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ getRelSections node 1000

echo "STEP2: Generate Templates for extracted Relevant sections"
rm -rf ../results//Node_ECMA262_Tests/
python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTemplates node 1000

echo "STEP3: Instantiate generated Templates"
rm -rf ../results//Node_ECMA262_Tests/
python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTests node 1000

echo "STEP4: Run and analyse generated Tests"
./analyzeGeneratedTests.sh

