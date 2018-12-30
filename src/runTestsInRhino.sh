#!/bin/bash

cp -r ../results/Rhino_ECMA262_Tests/ ~/rhino-Rhino1_7_9_Release/testsrc/tests/
cd ~/rhino-Rhino1_7_9_Release/testsrc/tests
ls Rhino_ECMA262_Tests/*.js > ../opt0.tests
cd ~/rhino-Rhino1_7_9_Release/
./gradlew clean
./gradlew jar
./gradlew -Dtest.single=MozillaSuiteTest test
./gradlew jacocoTestReport
