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

import sys
import re
import os
argpattern = re.compile("\(([^()]*)\)")
exceptionpattern = re.compile("throw a .* exception")
returnpattern = re.compile("return .*")
assignmentpattern = re.compile("Let .+\?*")
relevantstmtpattern1 = re.compile(".* If .* return .*")
relevantstmtpattern2 = re.compile(".* If .* the result is .*")
from printprogress import printProgressBar



class TestTemplate(object):
	def __init__(self, relspecpath):
		self.template_content = {}
		self.test_templates = {}
		self.variable_dataset = {}
		self.relevant_spec_path = relspecpath

	# method to check if a statement is an assignment
	# and if it is then store the variable and its value
	def getAssignment(self, specline):
		variable = ""
		value = ""
		funcval = False
		args = ""
		isassignment = re.search(assignmentpattern, specline)
		if isassignment:
			variable = specline.split(" be ")[0].split("Let ")[1].strip()
			value = specline.split(" be ")[1]
		if "(" in value and ")" in value:
			funcval = True
		if funcval is True:
			args = re.search(argpattern, value)
		if funcval and args:
			funcname = value.split("(")[0].replace("?", "")
			funcargs = args.group()
			return variable, funcname+funcargs
		else:
			return variable, value

	
	# method to simplify the conditional statements extracted from the body of 
	# relevant sections by translating English phrases in to syntaxtically valid code
	# and substituting the assignment variables with their values stored in dictionary  
	# the order of substitution matters!
	def substituteVars(self, text, sectionid):
		args = re.search(argpattern, text)		
		if args:
			funcname = text.split("(")[0].strip()
			funcargs = args.group()

		if text[0].isdigit() or ". " in text:
			text = "".join(text.split(". ")[1:])		
	
		if "If" in text:
			text = text.replace("If", "if (");
		if ", the result is" in text:
			text = text.replace(", the result is", ") return")
		if text.endswith("."):
			text = text[:-1]
		if "otherwise return" in text:
			text = text.replace("otherwise return", "else return");
		if "is not greater than" in text:
			text = text.replace("is not greater than", "<");		
		if "is not less than" in text:
			text = text.replace("is not less than", ">");		
		if "is greater than" in text:
			text = text.replace("is greater than", ">");		
		if "is less than" in text:
			text = text.replace("is less than", "<");		
		if "but less than" in text:
			var = text.split("</var>")[0].split("<var>")[1].strip()
			text = text.replace("but less than", " && " + var  + " <");		
		if "but greater than" in text:
			var = text.split("</var>")[0].split("<var>")[1].strip()
			text = text.replace("but greater than", " && " + var + " >");		
		if "is not equal to" in text:
			text = text.replace("is not equal to", "!=");		
		if " is equal to" in text:
			text = text.replace(" is equal to", " === ");
		if "is not" in text:
			text = text.replace("is not", "!=");		
		if " or " in text:
			text = text.replace(" or ", "|| ")
		if " and " in text:
			text = text.replace(" and ", "&& ")
		if ", return" in text:
			text = text.replace(", return", ") return")	
		if ", throw" in text:
			text = text.replace(", throw", ") throw")
		if "one of" in text:
#			print("SEE WHAT TO DO IN ", text)
			variable = text.split("one of ")[0].strip()
			values = text.split("one of")[1].split(")")[0].split(",")
			string = ""
#			print("VAR:", variable)
#			print("VAL:", values)
			for v in values[1:]:
				string = string + variable + " === " + v + " || "	
				text = text.replace(v, "")
			text = text.replace(",", "")
			text = text.replace(" or ", "")
			text = text.replace(values[0], "")
			text = text.replace("one of", values[0] + " || " + string[:-4])
		if " the " in text:
			text = text.replace(" the ", " ")	
		if " a " in text:
			text = text.replace(" a ", " ")
		if "does not have [[MapData]] internal slot" in text:
			text = text.replace("does not have [[MapData]] internal slot", " instanceof Map === false")	
		if "has [[MapData]] internal slot" in text:
			text = text.replace("has [[MapData]] internal slot", " instanceof Map === true")
		if "has [[ViewedArrayBuffer]] internal slot" in text:
			text = text.replace("has [[ViewedArrayBuffer]] internal slot", " instanceof ArrayBuffer === true")
		if "does not have an [[ArrayBufferData]] internal slot" in text:
			text = text.replace("does not have an [[ArrayBufferData]] internal slot", " instanceof ArrayBuffer === false")
		if " is exactly" in text:
			text = text.replace(" is exactly", " === ");
		if " is " in text:
			text = text.replace(" is ", " === ");
		text = text.strip() 
		for (variable,sid) in self.variable_dataset:
			if variable in text and sid==sectionid and variable not in self.variable_dataset[(variable,sid)]:
				text = text.replace(variable, self.variable_dataset[(variable,sid)])
		return text

	# method used to extract the method signature and create a callable 
	# function by creating an object of given class which then can be used 
	# to invoke the method under test
	def getMethodSignature(self, header):
		sectionid = header.split()[0]
		summary = " ".join(header.split()[1:]).replace("...", "")
		args = re.search(argpattern, summary)		
		if "Number" in summary:	
			if "prototype" in summary:
				callablefunction = "var output = Number(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"
			else:	
				callablefunction = "var output = Number." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "RegExp" in summary:
			if args:
				callablefunction = "var output = new RegExp(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"		
			else:
				callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"

		elif "Math" in summary:	
			callablefunction = "var output = Math." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "Date" in summary:
			callablefunction = "var output = new Date(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"		
		elif "Boolean" in summary:	
			callablefunction = "var output = new Boolean(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "String" in summary:
			callablefunction = "var output = new String(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"		
		elif "WeakMap" in summary:
			callablefunction = "const weakmap1 = new WeakMap(); var output = weakmap1." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "Map" in summary:
			callablefunction = "const map1 = new Map(); var output = map1." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "SharedArrayBuffer" in summary:
			if args is None:
				callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			else:	
				callablefunction = "var output = new SharedArrayBuffer(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
		elif "ArrayBuffer" in summary:
			args = re.search(argpattern, summary)		
			if args is None:
				callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			else:
				callablefunction = "var output = new ArrayBuffer(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "Array" in summary:
			if  ".prototype" in summary:
				summary = summary.strip().replace(".prototype", "")
								
			if "Array." in summary and "(" in summary:
				funcall = summary.strip().split("Array")[1].split("(")[0].replace(" ", "").strip()
				funarg = summary.strip().split("(")[1]	
				callablefunction = "var output = new Array(randominput)" + funcall + "(" + funarg + ";"	
			elif "Array" in summary and "(" in summary:
				callablefunction = "var output = new " + summary.strip().replace("\d.*", "").replace(".","") + ";"
				callablefunction = re.sub(" \d+", " ", callablefunction)									
			elif "Runtime Semantics: " in summary:
				callablefunction = callablefunction.split(".")[0] + "." + summary.split("Runtime Semantics: ")[-1].replace(" ", "") + ";"
		elif "Set" in summary:
			callablefunction = "const set1 = new Set(); var output = set1." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		return callablefunction
	

	# method to: (1) extract the assignment statement inside the body of the relevant section 
	# and store the variable and corresponding value (or function call) inside the dictonary
	# (2) extract the conditional statements and simplify them by substituting the variables (if exists) 
	# with their values   
	def extractAssignmentAndConditionals(self, header, body, methodsignature):
		sectionid = header.split()[0]
		self.variable_dataset.clear()
		numvars = 0
		for statement in body.split("\n"):
			if len(statement) > 100:
				continue
			#print(self.variable_dataset)
			statement = statement.replace("\xa0", " ")
			isassignment = re.search(assignmentpattern, statement.strip())
			if isassignment:
			#	print("ASSIGNMENT:", statement)
				var, value = self.getAssignment(statement)
				self.variable_dataset[var,sectionid] = value
				numvars += 1

			isexception = re.search(exceptionpattern, statement)
			if isexception:
				if "exception." in statement:
					errstmt = self.substituteVars(statement.split("exception.")[0], sectionid)
					tmpvars = numvars
					while(errstmt != self.substituteVars(errstmt, sectionid) and tmpvars>0):
						errstmt = self.substituteVars(errstmt, sectionid) 
						tmpvars -= 1;
					if header not in self.template_content:
						self.template_content[header] = [methodsignature]
						self.template_content[header].append(errstmt)
					else:
						self.template_content[header].append(errstmt)

			isinputoutput1 = re.search(relevantstmtpattern1, statement)
			isinputoutput2 = re.search(relevantstmtpattern2, statement)
			if isinputoutput1 or isinputoutput2:		
				updatedstatement = self.substituteVars(statement, sectionid)
				tmpvars = numvars
				while(updatedstatement != self.substituteVars(updatedstatement, sectionid) and tmpvars > 0):
					updatedstatement = self.substituteVars(updatedstatement, sectionid)
					tmpvars -= 1
				if header not in self.template_content:
					self.template_content[header] = [methodsignature]
					self.template_content[header].append(updatedstatement)
				else:
					self.template_content[header].append(updatedstatement)	


	def preprocess(self, text):
		text = text.replace("this value", "randominput")
		text = text.replace("if ", "")
		text = text.replace("the", "")
		text = text.replace("Type(", "typeof(")
	#       text = text.replace("thisTimeValue", "")
	#       text = text.replace("thisNumberValue", "")
		text = text.replace("empty String", "\"\"")
		text = text.replace("empty string", "\"\"")
		text = text.replace("String \"NaN\"", "\"NaN\"")
		text = text.replace("+∞", "Infinity")
		text = text.replace("-∞", "-Infinity")
		text = text.replace("∞", "Infinity")
		text = text.replace("+0", "0")
		text = text.replace("≥", ">=")
		text = text.replace("≤", "<=")
		text = text.replace("! ", "")
		text = text.replace("× ", "*")
		text = text.replace(" ≠ ", "!=")
		text = text.replace("min(", "Math.min(")
		text = text.replace("max(", "Math.max(")
		text = text.replace("number of elements in ToString(RequireObjectCoercible(randominput))", "ToString(RequireObjectCoercible(randominput)).length")
		text = text.replace("number of elements in ToString(searchString)", "ToString(searchString).length")

		if text[-1]==".":
			text = text[:-1]
		if " === " in text:
			lhs = text.split("===")[0].strip()
			rhs = text.split("===")[1].strip()

			if "NaN" in rhs or "-0" in rhs or "+0" in rhs:
				text = "Object.is" + lhs + "," + rhs
			else:
				text = lhs + "===" + rhs
		return text



	# method to generate a compilable test template function
	# for a given relevant section  using its callable function 
	# and conditional statements identified using above defined methods
	def generateCompilableTemplate(self, header):
		testtemplate = self.template_content[header]
		methodname = " ".join(header.split()[1:]).split("(")[0].strip()
		templatecount = 0
		templates = []
		testname = methodname.replace(".","_").replace("-","_").replace(" ", "_").lower()
		vardecl = testtemplate[0]
		if "..." in vardecl:
			vardecl = vardecl.replace("...", "")

		if "[" in vardecl:
			vardecl = vardecl.replace("[", "")
			vardecl = vardecl.replace("]", "")
		if "randominput" in vardecl and "output" not in vardecl:
			args = "randominput "
		else:
			args = ""
		if "." in vardecl:
			a = re.search(argpattern,vardecl.split(".")[0])
			b = re.search(argpattern,vardecl.split(".")[1])
			if a and len(a.group()) >2:
				if len(args) > 0:
					args = args + "," + a.group().replace("(", "").replace(")", "")
				else:
					args = args + a.group().replace("(", "").replace(")", "")
			if a and b and len(b.group()) >2:
					args = args + "," + b.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
			elif b and len(b.group()) >2:
				if len(args) > 0:
					args = args + ","  + b.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
				else:
					args = args + b.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
		else:
			if len(args) > 0:
				args = args + "," +  vardecl.split("(")[1].split(")")[0]
			else:
				args = args + vardecl.split("(")[1].split(")")[0]

		if "arguments" in args:
			args = args.replace("arguments", "args")

		testfunction = "function test_" + testname + "("+ args + "){" # to put all if conditions in one function
		for i in range(1, len(testtemplate)):
			templatecount += 1
		#       testfunction = "function test_" + testname + "_" + str(i)+ "("+ args + "){" to put if conditions in separate functions
			if "if " not in testtemplate[i]:
				continue
			test = ""
			testcondition = testtemplate[i]
			if "return" in testcondition:
				expectedinput = testcondition.split("return")[0].strip()
				expectedinput = self.preprocess(expectedinput)
				expectedoutput = self.preprocess(testcondition.split("return")[1].strip())
				test = "if (" + expectedinput + "){\n\t\t" + vardecl + "\n\t\t" + "new TestCase(\"" + testname + "\", \"" + testname + "\", " + expectedoutput + ", output);\n\t\ttest();\n\t\treturn;\n\t\t}"
				testfunction = testfunction + "\n\t" + test # + "\n}" to put if conditions in separate functions
				#print(testfunction)
				# templates.append(testfunction)
			if "throw" in testcondition:
				expectedinput = testcondition.split("throw")[0].strip()
				expectedinput = self.preprocess(expectedinput)
				expectedoutput = self.preprocess(testcondition.split("throw")[1].strip())
				test = "if (" + expectedinput + "){\n\t\t try{\n\t\t\t" + vardecl + "\n\t\t}catch(e){\n\t\t\t" + "new TestCase(\"" + testname + "\", \"" + testname + "\", true, eval(e instanceof "  + expectedoutput + "));\n\t\t\ttest();\n\t\t\treturn;\n\t\t}\n\t}" 
				testfunction = testfunction + "\n\t" + test # + "\n}" to put if conditions in separate functions
				#print(testfunction)
				# templates.append(testfunction)
		testfunction = testfunction + "\n}"  # to put all if conditions in one function
		templates.append(testfunction)
		if len(testtemplate) > 2:
#			print("##################\n",testfunction,"\n#################")
#			print("content len=", len(testtemplate))
			self.test_templates[header] = templates




	def generateTestTemplates(self, extracted_sections):
		numofsec = len(extracted_sections.keys())
		printProgressBar(0, numofsec, prefix = 'Generating Test Templates Progress:', suffix = 'Complete', length = 50)
		for idx, header in enumerate(sorted(extracted_sections)):
			printProgressBar(idx+1, numofsec, prefix = 'Generating Test Templates Progress:', suffix = 'Complete', length = 50)
#			print("################## START #################", idx)
#			print(header)
			if "21.1.3.19" in header or "21.2.5.6" in header:
				continue
			body = extracted_sections[header]
#			print(body)
			method_signature = self.getMethodSignature(header)
#			print(method_signature)
			self.extractAssignmentAndConditionals(header, body, method_signature)
#			print("identified template content")
			self.generateCompilableTemplate(header)
#			print("created compilable template")
#			print(self.test_templates[header])
#			print("################## END #################", idx)
#			print(len(extracted_sections.keys()))
		return self.test_templates	
