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
# script to instantiate test templates
# inputs: #args of test template function, name of test template function, #tests you wanna generate
# cmd to run: python instanciateTemplates.py 1 test_array 100
# output: list of function calls to the test template function using random data types and values 
# ==============================================================================
import sys
import string
import random
random.seed(123)
import datetime
import math
import os
from printprogress import printProgressBar

class ExecutableTest(object):
	def __init__(self, template_file_path, output_test_dir):
		self.numerics = ["0", "117", "-345", "15", "1", "0x1123", "0x00111", "-0xF1A7"]
		self.floats = ["3.1415926", "-.123456789", "-3.1E+12",".1e-23"]
		self.regexps = ['/ab+c/', '/\\r\\n|\\r|\\n/', '/(\w+)\s(\w+)/', '/yes.*day/', '/yes[^]*day/', '/foo/g', '/[\\u0400-\\u04FF]+/g','/[^.]+/']
		self.booleans = ['true', 'false']
		self.strings = ['foo', "bar", '1234', 'one line \\n another line',"John's cat"]
		self.specials = ["null", "undefined", "NaN", "Infinity", "-0", "+0"]
		self.numtests = 1000 
		self.argtypes = {}
		self.argtypes[1] = self.numerics
		self.argtypes[2] = self.floats
		self.argtypes[3] = self.booleans
		self.argtypes[4] = self.strings
		self.argtypes[5] = self.specials
		self.argtypes[6] = self.regexps
		self.templatefilepath = template_file_path 
		self.output_dir = output_test_dir
		if not os.path.exists(output_test_dir):
    			os.makedirs(output_test_dir)

		if not os.path.exists(output_test_dir + "/Rhino_ECMA262_Tests"):
    			os.makedirs(output_test_dir + "/Rhino_ECMA262_Tests")
    			
		if not os.path.exists(output_test_dir + "/Node_ECMA262_Tests"):
			os.makedirs(output_test_dir + "/Node_ECMA262_Tests")
	
	def stringGenerator(self, size=6, chars=string.ascii_uppercase + string.digits):
		return ''.join(random.choice(string.ascii_uppercase + string.digits) for _ in range(size))


	def IntializeTestInputs(self):
		# create random strings
		for i in range(1000):
			randsize = random.randint(3, 10)	
			randstr = self.stringGenerator(randsize)
			if randstr not in self.strings:
				self.strings.append(randstr)

		# create random integers
		for i in range(1000):
			randnum = random.randint(0, 1000)
			if randnum not in self.numerics and randnum%2==0:
				self.numerics.append(randnum)
			elif randnum not in self.numerics and randnum%2==1:
				self.numerics.append(-randnum)

		# create random floats
		for i in range(1000):
			a = sys.float_info.min
			b = sys.float_info.max
			randfloat = random.uniform(a, b)
			if randfloat not in self.floats:
				self.floats.append(randfloat)


	def generateTestInputsForMethod(self, funcname, numargs, numtests):
		self.IntializeTestInputs()
		generatedtests = []
		while len(generatedtests)!=numtests:
			test = funcname + "("
			nargsadded = 0
			while nargsadded!=numargs:
				argtype = random.randint(1, 6)
#				print(argtype, self.argtypes.keys())	
				randomindex = random.randint(0, len(self.argtypes[argtype])-1)	
				#print(argtypes[argtype][randomindex])
				if nargsadded==0 and "array_prototype" in funcname and (argtype == 5 or argtype==2 or argtype == 3 or (argtype==1 and ((int(str(self.argtypes[argtype][randomindex]),0)) < 0 or int(str(self.argtypes[argtype][randomindex]),0) > math.pow(2,32)))):
					continue
				if nargsadded==0 and "string_prototype" in funcname and argtype != 4:			
					continue
				if argtype == 4:
					test = test + "\"" + str(self.argtypes[argtype][randomindex]) + "\", "
				else:
					test = test + str(self.argtypes[argtype][randomindex]) + ", "	
				nargsadded += 1
			test = test[:-2] + ")"
			if test not in generatedtests:
				generatedtests.append(test)
		return generatedtests




	def replaceRhinoTestConstructorWithNodeJs(self, rhinotemplate):
		actual = rhinotemplate.split("new TestCase")[1].split("\n")[0].split(",")[2]
		expected = rhinotemplate.split("new TestCase")[1].split("\n")[0].split(",")[3]
		string = "new TestCase" +  rhinotemplate.split("new TestCase")[1].split("\n")[0]
		nodejstemplate = rhinotemplate.replace(string, "assert.strictEqual(" + actual + "," + expected + ";")
		#nodejstemplate = nodejstemplate.replace("test();", "\n\t\tconsole.log(\"Good Test\");\n\t\treturn;\n")
		#print(rhinotemplate)
		#print(nodejstemplate)
		return nodejstemplate

	def generateExecutableTests(self):
		f = open(self.templatefilepath)
		content = f.read()
		abstractfunctions = content.split("/*TEST TEMPLATES GENERATED AUTOMATICALLY*/")[0].strip()
		templates = content.split("/*TEST TEMPLATES GENERATED AUTOMATICALLY*/")[1].split("function ")
		printProgressBar(0, len(templates), prefix = 'Generating Executable Tests Progress:', suffix = 'Complete', length = 50)
		for idx, template in enumerate(templates):
			if template.startswith("test"):
				printProgressBar(idx+1, len(templates), prefix = 'Generating Executable Tests Progress:', suffix = 'Complete', length = 50)
				arguments = template.split("{")[0].split("(")[1].replace(")","").strip().split(",")
				testfunc = template.split("{")[0].split("(")[0].strip().lower()
				numargs = len(arguments)
				tests = self.generateTestInputsForMethod(testfunc, numargs, self.numtests)
				testfilerhino = open(self.output_dir + "/Rhino_ECMA262_Tests/" + testfunc + ".js", "w+")
				testfilenode = open(self.output_dir + "/Node_ECMA262_Tests/" + testfunc.replace("_","-") + ".js", "w+")
				testfilerhino.write("/*\n* This file is automatically generated by GenTest\n*\n* " + str(datetime.datetime.now()) + "\n*/\n\n\n")
				testfilenode.write("/*\n* This file is automatically generated by GenTest\n*\n* " + str(datetime.datetime.now()) + "\n*/\n\n\n")
				testfilenode.write("const common = require(\'../common\');\n")
				testfilenode.write("const assert = require(\'assert\');\n")
				testfilerhino.write("\n\nstartTest();\n\n")
				testfilenode.write(abstractfunctions + "\n")
				testfilerhino.write(abstractfunctions + "\n")
				testfilerhino.write("/*TEST TEMPLATE GENERATED AUTOMATICALLY*/\n")
				testfilenode.write("/*TEST TEMPLATE GENERATED AUTOMATICALLY*/\n")
				templatenodejs = self.replaceRhinoTestConstructorWithNodeJs(template)
				while "new TestCase" in templatenodejs:
					templatenodejs = self.replaceRhinoTestConstructorWithNodeJs(templatenodejs)
				
				
				templatenodejs = templatenodejs[:-2] + "\tconsole.log(\"Okay Test\");\n" + templatenodejs[-2:]
				templatenodejs = templatenodejs.replace("}catch(e){", "\t\tconsole.log(\"Bad Test\");\n\t\treturn;\n\t\t}catch(e){")
				
				testfilenode.write("function " + templatenodejs + "\n")
				testfilerhino.write("function " + template + "\n")
				testfilerhino.write("/*TESTS GENERATED AUTOMATICALLY*/\n")
				testfilenode.write("/*TESTS GENERATED AUTOMATICALLY*/\n")
				for t in tests:
					testfilenode.write(t + ";\n")
					testfilerhino.write(t + ";\n")
				testfilenode.close()
				testfilerhino.close()


