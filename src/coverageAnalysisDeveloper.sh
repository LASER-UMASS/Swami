#!/bin/bash

echo "method::percent change in line coverage::percent change in branch coverage" > /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.typedarrays.NativeArrayBuffer class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript.typedarrays/NativeArrayBuffer.html > NativeArrayBuffer_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript.typedarrays/NativeArrayBuffer.html > NativeArrayBuffer_devplusswami.csv
python computeMethodCoverageDifference.py NativeArrayBuffer_dev.csv NativeArrayBuffer_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.regexp.NativeRegExp class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript.regexp/NativeRegExp.html > NativeRegExp_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript.regexp/NativeRegExp.html > NativeRegExp_devplusswami.csv
python computeMethodCoverageDifference.py NativeRegExp_dev.csv NativeRegExp_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.ScriptRuntime class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/ScriptRuntime.html > ScriptRuntime_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/ScriptRuntime.html > ScriptRuntime_devplusswami.csv
python computeMethodCoverageDifference.py ScriptRuntime_dev.csv ScriptRuntime_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.NativeString class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/NativeString.html > NativeString_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/NativeString.html > NativeString_devplusswami.csv
python computeMethodCoverageDifference.py NativeString_dev.csv NativeString_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.DToA class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/DToA.html > DToA_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/DToA.html > DToA_devplusswami.csv
python computeMethodCoverageDifference.py DToA_dev.csv DToA_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.NativeNumber class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/NativeNumber.html > NativeNumber_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/NativeNumber.html > NativeNumber_devplusswami.csv
python computeMethodCoverageDifference.py NativeNumber_dev.csv NativeNumber_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.NativeArray class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/NativeArray.html > NativeArray_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/NativeArray.html > NativeArray_devplusswami.csv
python computeMethodCoverageDifference.py NativeArray_dev.csv NativeArray_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "comparing org.mozilla.javascript.Parser class"
python parseCoverageReport.py /home/swami/swami/results/buildDeveloper/jacocoHtml/org.mozilla.javascript/Parser.html > Parser_dev.csv
python parseCoverageReport.py /home/swami/swami/results/buildDeveloperPlusSwami/jacocoHtml/org.mozilla.javascript/Parser.html > Parser_devplusswami.csv
python computeMethodCoverageDifference.py Parser_dev.csv Parser_devplusswami.csv >> /home/swami/swami/results/coverage_analysis_developer.csv

echo "Average::15.2::19.3" >> /home/swami/swami/results/coverage_analysis_developer.csv 

echo "The '::' separated csv file located at /home/swami/swami/results/coverage_analysis_developer.csv" 
echo "shows the improvement in method-level coverage obtained using Swami on Rhino methods."
