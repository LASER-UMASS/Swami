#!/bin/bash

echo "RHINO: COMPARING COVERAGE OF DEVELOPER-WRITTEN TEST SUITE WITH COMBINED (DEVELOPER + SWAMI) TEST SUITE............................................"
cd /home/swami/rhino-Rhino1_7_9_Release/
cp -r /home/swami/swami/compareCoverage/ .
cp ./compareCoverage/Jacoco-Comparison-Tool-master/report.conf_developer ./compareCoverage/Jacoco-Comparison-Tool-master/report.conf
cp /home/swami/swami/results/buildDeveloper/jacoco/test.exec ~/rhino-Rhino1_7_9_Release/compareCoverage/source/testdeveloper.exec
cp /home/swami/swami/results/buildDeveloperPlusSwami/jacoco/test.exec ~/rhino-Rhino1_7_9_Release/compareCoverage/source/testdeveloperplusswami.exec
rm -rf ./compareCoverage/reports/*
cd ./compareCoverage/Jacoco-Comparison-Tool-master
./report.sh

echo
echo "The coverage comparsion report is available at: /home/swami/rhino-Rhino1_7_9_Release/compareCoverage/reports/index.html"
echo
