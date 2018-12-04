# Swami

This repository contains the source code and data 
to replicate the results in ICSE 2019 paper 

We use pdfminer (https://github.com/euske/pdfminer)
to convert the ECMA-262.pdf into the text file format. 
Both of these file are present inside the data directory. 

We use Jacoco-Comparison-Tool (https://github.com/mariamr/Jacoco-Comparison-Tool)
while comparing the difference between code coverage of
Swami-generated tests with Developer-written tests and 
EvoSuite-generated tests. Rhino's build facilitates measuring
code coverage using Jacoco (https://www.eclemma.org/jacoco/)

Swami generates tests from the text file format. 


