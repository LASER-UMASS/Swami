#!/bin/bash


cd ~/rhino-Rhino1_7_9_Release/
if [ -d buildDeveloper ]; then
   rm -rf buildDeveloper
fi

if [ -d buildSwami ]; then
   rm -rf buildSwami
fi

if [ -d buildCombined ]; then
   rm -rf buildCombined
fi

echo "RHINO: EXECUTING DEVELOPER-WRITTEN TEST SUITE ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt9.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt9.tests
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt-1.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt-1.tests
./gradlew clean
./gradlew jar
./gradlew test
echo "RHINO: MEASURING CODE COVERAGE OF DEVELOPER-WRITTEN TEST SUITE ................................................................"
./gradlew jacocoTestReport
mv buildGradle buildDeveloper

echo "RHINO: EXECUTING SWAMI-GENERATED TEST SUITE ..................................................................................."
cp -r ~/swami/results/Rhino_ECMA262_Tests/ ~/rhino-Rhino1_7_9_Release/testsrc/tests/
cd ~/rhino-Rhino1_7_9_Release/testsrc/tests
ls Rhino_ECMA262_Tests/*.js > ../opt0.tests
> ../opt9.tests
> ../opt-1.tests
cd ~/rhino-Rhino1_7_9_Release/
./gradlew clean
./gradlew jar
./gradlew -Dtest.single=MozillaSuiteTest test
echo "RHINO: MEASURING CODE COVERAGE OF SWAMI-GENERATED TEST SUITE ................................................................."
./gradlew jacocoTestReport
mv buildGradle buildSwami

echo "RHINO: EXECUTING COMBINED(DEVELOPER+SWAMI) TEST SUITE ........................................................................"
cd ~/rhino-Rhino1_7_9_Release/
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt9.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt9.tests
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt-1.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt-1.tests
cd ~/rhino-Rhino1_7_9_Release/testsrc/tests
ls Rhino_ECMA262_Tests/*.js >> ../opt0.tests
cd ~/rhino-Rhino1_7_9_Release/
./gradlew clean
./gradlew jar
./gradlew test
echo "RHINO: MEASURING CODE COVERAGE OF COMBINED TEST SUITE ........................................................................"
./gradlew jacocoTestReport
mv buildGradle buildCombine

echo "RHINO: COMPARING COVERAGE OF DEVELOPER-WRITTEN TEST SUITE WITH COMBINED TEST SUITE............................................"
cd ~/rhino-Rhino1_7_9_Release/
cp -r ~/swami/compareCoverage/ .
cp buildDeveloper/jacoco/test.exec ~/rhino-Rhino1_7_9_Release/compareCoverage/source/testdev.exec
cp buildCombine/jacoco/test.exec ~/rhino-Rhino1_7_9_Release/compareCoverage/source/testcombine.exec
cd ./compareCoverage/Jacoco-Comparison-Tool-master
rm -rf ./compareCoverage/reports/*
./report.sh
 	
