# Swami

Swami is a tool to automatically generate executable tests for JavaScript language from
ECMAScript (ECMA-262) specification documents.
This repository contains the source code, data, and results described in the paper titled: 

**Automatically Generating Precise Oracles from Structured Natural Language Specifications**, in Proceedings of the 41st International Conference on Software Engineering (ICSE), 2019
by Manish Motwani and Yuriy Brun.

## How to install Swami

1. Install [Python version 3.5.2](https://www.python.org/downloads/release/python-352/)
2. Install [Standford CoreNLP](https://github.com/Lynten/stanford-corenlp) package using command:`pip install stanfordcorenlp`
3. Clone this repository
4. Download [Standford API](http://nlp.stanford.edu/software/stanford-corenlp-full-2018-02-27.zip) and unzip the file inside Swami/src/lib/ directory 

## How to run Swami

### Pre-requisites
1. Input specification file in **text** format (ECMA-262_v8.txt). We convert [ECMA-262 V8](http://www.ecma-international.org/publications/files/ECMA-ST-ARCH/ECMA-262%208th%20edition%20June%202017.pdf) pdf file 
   into the text format using [pdfminer](https://github.com/euske/pdfminer) and manually validated (and corrected whereever needed) the convered text. 
   The input specification file is available [here](https://bitbucket.org/manishmotwani/swami/src/master/data/ECMA-262_v8.txt).
2. Source code file implementing Abstract functions. We manually implement some of the abstract functions that are used by the automatically generated test templates. 
   The implemented Abstract functions source code is available [here](https://bitbucket.org/manishmotwani/swami/src/master/data/abstractFunctions.js)
3. [Rhino-1.7.9](https://github.com/mozilla/rhino/releases/tag/Rhino1_7_9_Release) and [Node-10.7.0](https://github.com/nodejs/node/releases/tag/v10.7.0) source code.   

### Input/Output specifications for different modules of Swami
Swami allows you to run in three different modes that correspond to following three modules. 

#### Extracting Relevant Sections
* **Description:** This module is used to extract the relevant specification sections (sections which encode testable behavior) from the input specification document.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, and the path to output directory
* **Output:** Text file listing all the relevant sections describing *ID* (section id), *Summary* (section heading), and *Description* (section body) for each of the extracted sections. 
* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ getRelSections node 1000`

#### Generating Test Templates
* **Description:** This module is used to generate *Test Templates* from the specifications that encode the testable behavior. 
As Swami focuses on generating tests for boundary conditions and exceptional behaviour, it generates test templates for the specifications 
that describe either of these system properties.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, and the path to output directory
This module reuses the file listing relevant sections extracted from input specification if it already exists otherwise runs the above module
to extract relevant sections.  
* **Output:** The JavaScript file (`ecma262_templates.js`) generated inside the output directory. 
* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTemplates node 1000`

#### Generating Executable Tests
* **Description:** This module is used to generate executable JavaScript test files by instantiating the test templates individually using randomly generated test inputs.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, path to output directory, and the number of tests to be generated for each template (default=1000).
* **Output:** Test files generated for Rhino are available in: `<path-to-output-directory>/Rhino_ECMA262_Tests`
Test files generated for Node.js are available in: `<path-to-output-directory>/Node_ECMA262_Tests`

* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTests node 1000`

## How to compare Swami's outputs to outputs described in the paper.
Please refer to the README.pdf file inside the artifact_documentation directory to reproduce the results reported in the paper.
