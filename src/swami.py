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
		self.output_test_dir = outputdir 
		self.rel_sec = RelevantSection()
		self.test_template = TestTemplate()
		self.executable_test = ExecutableTest()

	def extractRelevantSections(okapi=False):
		pass

	def extractTestTemplate():
		pass

	def generateExecutableTests():
		pass


if __name__ == '__main__':
	if len(sys.argv) < 3 or len(sys.argv) > 3:
		print("USAGE: python swami.py <path-to-ECMA-262_v8.txt> <path-to-output-test-directory> \nEXAMPLE USAGE: python swami.py ../data/ECMA-262_v8.txt ../RhinoTestSuite")
		sys.exit(1)
	
	input_spec_file = sys.argv[1]
	output_dir = sys.argv[2]

















