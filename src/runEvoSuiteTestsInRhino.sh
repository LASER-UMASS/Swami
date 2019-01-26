# This script can be used to execute the five EvoSuite-generated test suites in Rhino

#!/bin/bash

cd ~/rhino-Rhino1_7_9_Release/

if [ -d buildEvoSuite1 ]; then
   rm -rf buildEvoSuite1
fi

if [ -d buildEvoSuite2 ]; then
   rm -rf buildEvoSuite2
fi

if [ -d buildEvoSuite3 ]; then
   rm -rf buildEvoSuite3
fi

if [ -d buildEvoSuite4 ]; then
   rm -rf buildEvoSuite4
fi

if [ -d buildEvoSuite5 ]; then
   rm -rf buildEvoSuite5
fi

echo "RHINO: EXECUTING EVOSUITE TEST SUITE#1 ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp build.gradle_es1 build.gradle
./gradlew clean
./gradlew jar
./gradlew test
echo "RHINO: MEASURING CODE COVERAGE OF EVOSUITE TEST SUITE#1 ................................................................"
./gradlew jacocoTestReport
mv buildGradle buildEvoSuite1

echo "RHINO: EXECUTING EVOSUITE TEST SUITE#2 ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp build.gradle_es2 build.gradle
./gradlew clean
./gradlew jar
./gradlew test
mv buildGradle buildEvoSuite2

echo "RHINO: EXECUTING EVOSUITE TEST SUITE#3 ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp build.gradle_es3 build.gradle
./gradlew clean
./gradlew jar
./gradlew test
mv buildGradle buildEvoSuite3

echo "RHINO: EXECUTING EVOSUITE TEST SUITE#4 ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp build.gradle_es4 build.gradle
./gradlew clean
./gradlew jar
./gradlew test
mv buildGradle buildEvoSuite4

echo "RHINO: EXECUTING EVOSUITE TEST SUITE#5 ................................................................................."
cd ~/rhino-Rhino1_7_9_Release/
cp build.gradle_es5 build.gradle
./gradlew clean
./gradlew jar
./gradlew test
mv buildGradle buildEvoSuite5
