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
# This is the main driver program that is used to: (a) extract relevant sections 
# from ECMA-262 document, (b) generate test templates for extracted secrions, and 
# (c) generate executable tests by instantiating generated test templates.
# ==============================================================================

import os
import sys
import subprocess
import argparse
from extractRelevantSections import RelevantSection 
from generateTestTemplates import TestTemplate 
from generateExecutableTests import ExecutableTest
from printprogress import printProgressBar
from time import sleep

class Swami(object):
	def __init__(self, inputfilepath, abstractfunfilepath, outputdir, compiler):
		self.input_spec = inputfilepath
		self.abstractfunc_file_path = abstractfunfilepath
		self.output_dir = outputdir 
		self.templatefilepath = self.output_dir + "/ecma262_templates.js"
		self.rel_sec_extractor = RelevantSection()
		self.relevant_spec = self.output_dir + "/" + self.input_spec.split("/")[-1].split(".")[0] + "_relevant_sections.txt"
		self.relevant_spec_exists = os.path.isfile(self.relevant_spec)
		self.test_template_generator = TestTemplate(self.relevant_spec, compiler)
		self.executable_test_generator = ExecutableTest(self.templatefilepath, self.output_dir, compiler)
		self.extracted_sections = {}
		self.compiler = compiler

	# returns a dictionary of relevant sections (sections that involve 
	# exceptions or boundary conditions) where key is the section title  
	# and value is the body of the section
	def extractRelevantSections(self, okapi=False):
		print("Extracting relevant sections from: ", self.input_spec)
		filepath = self.relevant_spec
		print("begin extracting relevant sections .....................................")
		rel_sec_file = open(filepath, "w")
		extracted_sections = self.rel_sec_extractor.getRelevantSections(self.input_spec)
		section_count = 0
		numofsec = len(extracted_sections)
		printProgressBar(0, numofsec, prefix = 'Writing Relevant Sections to the File Progress:', suffix = 'Complete', length = 50)
		for header in sorted(extracted_sections):
			section_count += 1
			printProgressBar(section_count + 1, numofsec, prefix = 'Writing Relevant Sections to the File Progress:', suffix = 'Complete', length = 50)
			sectionid = header.split()[0]
			summary = " ".join(header.split()[1:])
			body = extracted_sections[header]
			rel_sec_file.write("############# BEGIN ## " + str(section_count) + " ###########################\n")
			rel_sec_file.write("ID= " +  sectionid + "\n")
			rel_sec_file.write("Summary= " +  summary + "\n")
			rel_sec_file.write("Description= " + body + "\n") 
			rel_sec_file.write("#############  END  ## " + str(section_count) + " ###########################\n")
			if header not in self.extracted_sections:
				self.extracted_sections[header] = body
		rel_sec_file.close()
		self.rel_sec_extractor.nlp.close()
		print()
		print("Total number of relevant sections extracted = ", len(extracted_sections))
		print("Output is available in: ", filepath)
	
	# method to parse the extracted sections stored in a file 
	# and load them in the dictonary
	def readRelevantSections(self):
		if self.relevant_spec_exists is True:	
			rel_sec_file = open(self.relevant_spec)
			startsec = False
			for line in rel_sec_file:
				if startsec is False and "############# BEGIN ##" in line:
					startsec = True
					body = ""
					header = ""
				elif "ID= " in line:
					header += line.split("=")[1].strip()		
				elif "Summary= " in line:
					header += " " + line.split("=")[1].strip() # + "\n"		
				elif "Description= " in line:
					body += line.split("=")[1].strip() + "\n"
				elif "#############  END  ## "in line:
					if header not in self.extracted_sections:
						self.extracted_sections[header] = body
					startsec = False
				elif startsec is True and len(line)>1:
					body += line.strip() + "\n"		
	
	# method to add the implemented Abstract Functions to the generated 
	# test files
	def addAbstractFunctions(self):
		template_file = open(self.templatefilepath, "w+")
		abstract_func_file = open(self.abstractfunc_file_path)
		abstract_functions = abstract_func_file.read()
		template_file.write(abstract_functions)
		abstract_func_file.close()
		template_file.close()

	# method to generate test templates from extracted sections 
	def generateTemplates(self, extracted_sections):
		self.addAbstractFunctions()
		templates = self.test_template_generator.generateTestTemplates(extracted_sections)
		template_file = open(self.templatefilepath, "a")
		template_file.write("\n\n/*TEST TEMPLATES GENERATED AUTOMATICALLY*/\n\n")
		count = 0
		for header in sorted(templates, key=templates.get):
			template = templates[header]
			tmp_file_name = "tmp_template_file.js"
			tmp_template_file = open(tmp_file_name, "w")	
			tmp_template_file.write(template)
			tmp_template_file.close()
			cmd = "~/node-10.7.0/node "  +  tmp_file_name + " 2> /dev/null"
			try:
				if subprocess.check_call(cmd, shell=True) == 0:
					template_file.write("\n\n")
					template_file.write(template)	
					template_file.write("\n")
					count += 1
			except:
				continue
		template_file.close()
		print("Total number of test templates generated = ", count)
		print("Generated templates are available in file: ", self.templatefilepath)
	
	# method to instantiate generated test template using random test inputs 
	# numtests specifies the number of test inputs to be generated
	def generateTests(self, numtests):
		self.executable_test_generator.generateExecutableTests(numtests)
		if self.compiler == "rhino":
			print("Test files generated for Rhino are available in: " + self.output_dir + "/Rhino_ECMA262_Tests" )
		if self.compiler == "node":
			print("Test files generated for Node.js are available in: " + self.output_dir + "/Node_ECMA262_Tests" )


if __name__ == '__main__':
	if len(sys.argv) != 7:
		print("Error! Invalid Command \nUSAGE: python swami.py <path-to-specification-file> <path-to-abstract-functions-code> <path-to-output-directory> <[getRelSections | genTemplates | genTests]> \
		     < rhino | node > <#tests>\nEXAMPLE USAGE: python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../RhinoTestSuite/ genTests rhino 1000")	
		sys.exit(1)

	specification_path = sys.argv[1]
	abstract_func_path = sys.argv[2]
	output_dir_path = sys.argv[3]
	task = sys.argv[4]
	compiler = sys.argv[5]
	test_generator = Swami(specification_path, abstract_func_path, output_dir_path, compiler)
	

	# extract relevant sections only and write to file
	if task == "getRelSections":
		test_generator.extractRelevantSections()
	

	# extract (or use existing) relevant sections and generate test templates
	elif task == "genTemplates":
		if not test_generator.relevant_spec_exists:
			test_generator.extractRelevantSections()
		else:
			print("Reading relevant sections from existing file...............")
			test_generator.readRelevantSections()
		print("attempting to generate templates for ", len(test_generator.extracted_sections), " relevant sections")
		test_generator.generateTemplates(test_generator.extracted_sections)
	

	# generate full test suites from scratch
	elif task == "genTests":
		numtests = int(sys.argv[6])

		if not test_generator.relevant_spec_exists:
			test_generator.extractRelevantSections()
		else:
			print("Reading relevant sections from existing file...............")
			test_generator.readRelevantSections()
		if not os.path.isfile(test_generator.templatefilepath):
			test_generator.generateTemplates(test_generator.extracted_sections)
		test_generator.generateTests(numtests)
	else:
		print("Error! Invalid Command \nUSAGE: python swami.py <path-to-specification-file> <path-to-abstract-functions-code> <path-to-output-directory> <[getRelSections | genTemplates | genTests]> \
		     < rhino | node > <#tests>\nEXAMPLE USAGE: python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../RhinoTestSuite/ genTests rhino 1000")	
		sys.exit(1)
