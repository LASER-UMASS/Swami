# ICSE 2019 Artifact Evaluation Getting Started Guide for Swami

This repository contains the source code and data to replicate the results described in the ICSE 2019 paper 

Provide documentation with your artifact.  We recommend that you prepare a Getting Started Guide.  It should explain:
how to download your artifact
how to install your artifact
how to run your artifact
how to compare your artifact’s outputs to outputs described in your paper.
Explicitly enumerate your claims in both your paper and in your artifact’s documentation.
Provide a VM if possible, and when appropriate.  VMs aid reproducibility because they help control for nuisance factors that are not central to an author’s claims, significantly facilitating the review process.  Nonetheless, reviewers may need to accept performance tradeoffs for VMs (e.g., because of the absence of special hardware).  These tradeoffs are acceptable as long as authors explain to reviewers how and why they should adjust their expectations.
Provide step-by-step instructions, but make it easy for reviewers to supply their own inputs to your artifact.  When reviewers can “play” with your artifact, it gives them confidence that your ideas were implemented robustly.



We use pdfminer (https://github.com/euske/pdfminer)
to convert the ECMA-262.pdf into the text file format. 
Both of these file are present inside the data directory. 

We use Jacoco-Comparison-Tool (https://github.com/mariamr/Jacoco-Comparison-Tool)
while comparing the difference between code coverage of
Swami-generated tests with Developer-written tests and 
EvoSuite-generated tests. Rhino's build facilitates measuring
code coverage using Jacoco (https://www.eclemma.org/jacoco/)

Swami generates tests from the text file format. 


