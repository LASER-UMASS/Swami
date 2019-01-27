#!/bin/bash


echo "RHINO: COMPARING COVERAGE OF EVOSUITE-GENERATED TEST SUITE WITH COMBINED (EVOSUITE + SWAMI) TEST SUITE............................................"
cd /home/swami/rhino-Rhino1_7_9_Release/
cp -r /home/swami/swami/compareCoverage/ .
cp ./compareCoverage/Jacoco-Comparison-Tool-master/report.conf_evosuite ./compareCoverage/Jacoco-Comparison-Tool-master/report.conf
cp /home/swami/swami/results/buildEvoSuite1/jacoco/test.exec /home/swami/rhino-Rhino1_7_9_Release/compareCoverage/source/testevosuite.exec
cp /home/swami/swami/results/buildEvoSuite1PlusSwami/jacoco/test.exec /home/swami/rhino-Rhino1_7_9_Release/compareCoverage/source/testevosuiteplusswami.exec
rm -rf ./compareCoverage/reports/*
cd ./compareCoverage/Jacoco-Comparison-Tool-master
./report.sh

echo
echo "The coverage comparsion report is available at: /home/swami/rhino-Rhino1_7_9_Release/compareCoverage/reports/index.html"
echo
