# MIT License
#
# Copyright (c) 2018 LASER-UMASS
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
# ==============================================================================
#
# This is the main driver program that is used to generate tests
# from natural-language specifications.
# INPUT: ECMA-262 document in txt format
# OUTPUT: Directory containing executable test-files for JavaScript
# TO RUN: python swami.py <path-to-specification-doc> <path-to-output-directory>
#
# ==============================================================================


import sys
import argparse
from extractRelevantSections import RelevantSection 
from extractTestTemplate import TestTemplate 
from generateExecutableTests import ExecutableTest

class Swami(object):
	def __init__(self, inputfile, outputdir):
		self.input_spec = inputfile
		self.output_dir = outputdir 
		self.rel_sec_extractor = RelevantSection()
		self.test_template_generator = TestTemplate()
		self.executable_test_generator = ExecutableTest()

	# returns a dictionary of relevant sections (sections that deal 
	# with exceptions of boundary conditions) where key is the heading 
	# and value is the body of the section
	def extractRelevantSections(self, okapi=False):
		filepath = self.output_dir + "/" + self.input_spec.split("/")[-1].split(".")[0] + "_relevant_sections.txt"
		print("Extracting relevant sections from: ", self.input_spec, " and storing them in: ", filepath)
		print("begin extracting relevant sections .....................................")
		rel_sec_file = open(filepath, "w")
		extracted_sections = self.rel_sec_extractor.getRelevantSections(self.input_spec)
		print("finished extracting relevant sections ..................................")
		for header in sorted(extracted_sections):
			sectionid = header.split()[0]
			summary = " ".join(header.split()[1:])
			body = extracted_sections[header]
			rel_sec_file.write("##########################################\n")
			rel_sec_file.write("ID= " +  sectionid + "\n")
			rel_sec_file.write("Summary= " +  summary + "\n")
			rel_sec_file.write("Description= " + body + "\n") 
			rel_sec_file.write("##########################################\n")
		rel_sec_file.close()
		self.rel_sec_extractor.nlp.close()
		print("finished writing relevant sections to file .............................")
		print("Total number of relevant sections extracted = ", len(extracted_sections))
	
	
	
	def extractTestTemplates(self):
		pass

	def generateExecutableTests(self):
		pass


if __name__ == '__main__':
	if len(sys.argv) < 3 or len(sys.argv) > 4:
		print("Invalid Command Error!\nUSAGE: python swami.py <path-to-specification-file> <path-to-output-directory> <[getRelSection | genTemplates | genTests]> \nEXAMPLE USAGE: python swami.py ../data/ECMA-262_v8.txt ../RhinoTestSuite/")	
		sys.exit(1)

	specification_path = sys.argv[1]
	output_dir_path = sys.argv[2]
	test_generator = Swami(specification_path, output_dir_path)
	# extract relevant sections only and write to file
	if sys.argv[3] == "getRelSections":
		test_generator.extractRelevantSections()
	# only generate test templates
	elif sys.argv[3] == "genTemplates":
		test_generator.extractRelevantSections()
		test_generator.extractTestTemplates()
	# generate full test suites
	elif sys.argv[3] == "genTests":
		test_generator.extractRelevantSections()
		test_generator.extractTestTemplates()
		test_generator.extractExecutableTests()
	else:
		print("Invalid Command Error!\nUSAGE: python swami.py <path-to-specification-file> <path-to-output-directory> <[getRelSection | genTemplates | genTests]> \nEXAMPLE USAGE: python swami.py ../data/ECMA-262_v8.txt ../RhinoTestSuite/")	
		sys.exit(1)
