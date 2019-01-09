#!/bin/bash

echo "RHINO: EXECUTING DEVELOPER-WRITTEN TEST SUITE ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests
./gradlew clean
./gradlew jar
./gradlew test
echo "RHINO: MEASURING CODE COVERAGE OF DEVELOPER-WRITTEN TEST SUITE ................................................................"
./gradlew jacocoTestReport
mv buildGradle buildDeveloper

echo "RHINO: EXECUTING SWAMI-GENERATED TEST SUITE ..................................................................................."
cp -r ../results/Rhino_ECMA262_Tests/ ~/rhino-Rhino1_7_9_Release/testsrc/tests/
cd ~/rhino-Rhino1_7_9_Release/testsrc/tests
ls Rhino_ECMA262_Tests/*.js > ../opt0.tests
cd ~/rhino-Rhino1_7_9_Release/
./gradlew clean
./gradlew jar
./gradlew -Dtest.single=MozillaSuiteTest test
echo "RHINO: MEASURING CODE COVERAGE OF SWAMI-GENERATED TEST SUITE ................................................................."
./gradlew jacocoTestReport
mv buildGradle buildSwami

echo "RHINO: EXECUTING COMBINED(DEVELOPER+SWAMI) TEST SUITE ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests.orig ~/rhino-Rhino1_7_9_Release/testsrc/opt0.tests
cd ~/rhino-Rhino1_7_9_Release/testsrc/tests
ls Rhino_ECMA262_Tests/*.js >> ../opt0.tests
cd ~/rhino-Rhino1_7_9_Release/
./gradlew clean
./gradlew jar
./gradlew test
echo "RHINO: MEASURING CODE COVERAGE OF COMBINED TEST SUITE ................................................................"
./gradlew jacocoTestReport
mv buildGradle buildCombine
