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
from stanfordcorenlp import StanfordCoreNLP
from printprogress import printProgressBar
argpattern = re.compile("\(([^()]*)\)")
exceptionpattern = re.compile("throw a .* exception")
returnpattern = re.compile("return .*")
assignmentpattern = re.compile("Let .+\?*")
relevantstmtpattern1 = re.compile("If .* return .*")
relevantstmtpattern2 = re.compile("If .* the result is .*")

class TestTemplate(object):
	def __init__(self, relspecpath, compiler):
		self.template_content = {}
		self.test_templates = {}
		self.variable_dataset = {}
		self.relevant_spec_path = relspecpath
		self.compiler = compiler
		self.nlp = StanfordCoreNLP(r'lib/stanford-corenlp-full-2018-02-27')

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
			value = value.replace("?", "").strip()
			value = value.replace("!", "").strip()
			if value.endswith("."):
				return variable, value[:-1]
			else:			
				return variable, value
		else:
			return variable, value
		
	
	# method to simplify the conditional statements extracted from the body of 
	# relevant sections by translating English phrases in to syntaxtically valid code
	# and substituting the assignment variables with their values stored in dictionary  
	# the order of substitution matters!
	def substituteVars(self, text, sectionid):

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
		if "but greater than or equal to" in text:
			var = text.split("is")[0].split()[-1].strip()
			text = text.replace("but greater than or equal to", " && " + var + " >= ");		
		if "but greater than" in text:
			var = text.split("is")[0].split()[-1].strip()
			text = text.replace("but greater than", " && " + var + " >");	
		if "but less than or equal to" in text:
			var = text.split("is")[0].split()[-1].strip()
			text = text.replace("but less than or equal to", " && " + var + " <= ");		
		if "but less than" in text:
			var = text.split("is")[0].split()[-1].strip()
			text = text.replace("but less than", " && " + var + " < ");	
		if "is not greater than" in text:
			text = text.replace("is not greater than", "< ");		
		if "is not less than" in text:
			text = text.replace("is not less than", "> ");		
		if "is greater than" in text:
			text = text.replace("is greater than", "> ");		
		if "is less than" in text:
			text = text.replace("is less than", "< ");		
		if "is negative" in text:
			text = text.replace("is negative", "< 0");		
		if "is positive" in text:
			text = text.replace("is positive", "> 0");		
		if "is not equal to" in text:
			text = text.replace("is not equal to", " != ");		
		if " is equal to" in text:
			text = text.replace(" is equal to", " === ");
		if "is not" in text:
			text = text.replace("is not", " != ");		
		if " or " in text:
			if "," in text.split(" or ")[0]:
				variable = ""
				values = []
				result = ""
				if "is " in text:
					variable = text.split("is ")[0].split()[-1]
					if "return" in text:
						values = text.split("is ")[1].split("return")[0].split(",")
						result = "return" + text.split("return")[1]
					elif "throw" in text:
						values = text.split("is ")[1].split("throw")[0].split(",")
						result = "throw" + text.split("throw")[1]
					
				if "=== " in text:
					variable = text.split("=== ")[0].split()[-1]
					if "return" in text:
						values = text.split("=== ")[1].split("return")[0].split(",")
						result = "return" + text.split("return")[1]
					elif "throw" in text:
						values = text.split("=== ")[1].split("throw")[0].split(",")
						result = "return" + text.split("return")[1]
				if len(values) > 0:
					string = ""
					for v in values:
						if v.strip() != "":
							string = string + variable + " === " + v.strip() + " || "	
							text = text.replace(v.strip(), "")
					text = text.split(variable)[0] + string[:-4] + " ) " + result
					text = text.replace(",", "")
					text = text.replace(" or ", "")
			else:
				if "is " in text:
					var = text.split("is ")[0].split()[-1]
					values = text.split("is ")[1].split(")")[0].split("or")
					if len(values) == 2:
						text = text.split("is ")[0] + " === " + values[0] + " || " + var + " === " + values[1] + ")" + ''.join(text.split(")")[1:])
				else:
					text = text.replace(" or ", " || ")
		if " and " in text:
			text = text.replace(" and ", " && ")
		if ", return" in text:
			text = text.replace(", return", ") return")	
		if ", throw" in text:
			text = text.replace(", throw", ") throw")
		if "is one of" in text:
			variable = text.split("is one of ")[0].split()[-1]
			values = text.split("is one of")[1].split(")")[0].split(",")
			string = ""
			for v in values:
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

		text = text.replace("≥", ">= ")
		text = text.replace("-", "- ")
		text = text.strip().replace("(", " ( ").replace(")", " ) ").replace(",", " , ").replace("+", " + ").replace(">", " > ").replace(".length", " .length").replace(">=", " >= ").replace("<", " < ").replace("<=", " <= ").replace("≤", " ≤ ") + " "
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
		callablefunction = "unknown(unknown)"
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
			callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "Map" in summary:
			callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "SharedArrayBuffer" in summary:
			if args is None:
				callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			else:	
				callablefunction = "var output = new SharedArrayBuffer(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
		elif "ArrayBuffer" in summary:
			args = re.search(argpattern, summary)	
			if args is None or "prototype" in summary:
				callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			elif args and "prototype" not in summary:
				callablefunction = "var output = ArrayBuffer." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			else:
				callablefunction = "var output = new ArrayBuffer(randominput)." + summary.strip().split(".")[-1].replace(" ", "") + ";"
		elif "Array" in summary:
			if  "prototype" not in summary and "." in summary:
				callablefunction = "var output = Array." + summary.strip().split(".")[-1].replace(" ", "") + ";"	
			else:
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
			callablefunction = "var output = randominput." + summary.strip().split(".")[-1].replace(" ", "") + ";"
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
			statement = statement.replace("\xa0", " ")
			isassignment = re.search(assignmentpattern, statement.strip())
			if isassignment:
				postags = self.nlp.pos_tag(statement)
				match = False
				for i in range(len(postags)):
					if "NN" in postags[i][1]:
						match = True
						break 
				if not match:
					continue
				var, value = self.getAssignment(statement)
				var = " " + var + " "
				if "." in value and ".length" not in value:
					value = value.split(".")[0]
				if "the number of elements in" in value:
					value = value.replace("the number of elements in", "").strip() + ".length"
				self.variable_dataset[var,sectionid] = value
				numvars += 1

			isexception = re.search(exceptionpattern, statement)
			if isexception:
				postags = self.nlp.pos_tag(statement)
				match = False
				for i in range(len(postags)):
					if "NN" in postags[i][1]:
						match = True
						break 
				if match and "exception." in statement:
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
				postags = self.nlp.pos_tag(statement)
				match = False
				for i in range(len(postags)):
					if "NN" in postags[i][1]:
						match = True
						break 
				if not match:
					continue
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
	


	# method to process specific symbols and phrases in the
	# extracted natural language conditional statements in to
	# valid JavaScript symbols and variables 
	def convertTextToCode(self, text):
		text = ' '.join(text.split())
		text = text.replace("this value.", "randominput")
		text = text.replace("this value", "randominput")
		text = text.replace("result of ", "")
		text = text.replace("if", "")
		text = text.replace(" the ", "")
		text = text.replace("Type (", "typeof (")
		text = text.replace(" Object ", " \"object\" ")
		text = text.replace(" Number ", " \"number\" ")
		text = text.replace("empty String", "\"\"")
		text = text.replace("empty string", "\"\"")
		text = text.replace("String \"NaN\"", "\"NaN\"")
		text = text.replace("+∞", "+Infinity")
		text = text.replace("-∞", "-Infinity")
		text = text.replace("∞", "Infinity")
		text = text.replace("‑", "-")
		text = text.replace("+0", "0")
		text = text.replace("‑0", "-0")
		text = text.replace("≥", ">= ")
		text = text.replace("> =", ">= ")
		text = text.replace("< =", "<= ")
		text = text.replace("≤", "<= ")
		text = text.replace("! ", "")
		text = text.replace("× ", "*")
		text = text.replace(" ≠ ", "!= ")
		text = text.replace("! =", "!= ")
		text = text.replace("! ", "")
		text = text.replace("min (", "Math.min (")
		text = text.replace("max (", "Math.max (")
		text = text.replace("abs (", "Math.abs (")
		if "already an integer" in text:
			var = text.split("===")[0].split("(")[1]
			text = text.replace("already an integer", "parseInt(" + var +", 10)")
		if "number of elements in" in text:
			text =  text.split("number of elements in")[0] + text.split("number of elements in")[1].replace(") ) )", ") ).length )")		

		if text[-1]==".":
			text = text[:-1]
	
		if "===" in text and ("NaN" in text or "-0" in text or "+ 0" in text):
			if "&&" in text:
				newtext = "("
				clauses = text.split("&&")
				for idx, clause in enumerate(clauses):
					if " === " in clause:
						lhs = clause.split("===")[0].strip()
						rhs = clause.split("===")[1].strip()
						if "NaN" in rhs or "-0" in rhs or "+ 0" in rhs:
							if idx == 0:
								clause = "Object.is" + lhs + "," + rhs + ")"
							else:
								clause = "Object.is(" + lhs + "," + rhs + ")"
					if idx < len(clauses)-1:
						newtext += clause + " && "
					else:
						newtext += clause
				text = newtext
			elif "||" in text:
				newtext = "("
				clauses = text.split("||")
				for idx, clause in enumerate(clauses):
					if " === " in clause:
						lhs = clause.split("===")[0].strip()
						rhs = clause.split("===")[1].strip()
						if "NaN" in rhs or "-0" in rhs or "+ 0" in rhs:
							if idx == 0:
								clause = "Object.is" + lhs + "," + rhs + ")"
							else:
								clause = "Object.is(" + lhs + "," + rhs + ")"
					if idx < len(clauses)-1:
						newtext += clause + " && "
					else:
						newtext += clause
				text = newtext
			

			else:
				lhs = text.split("===")[0].strip()
				rhs = text.split("===")[1].strip()
				text = "Object.is" + lhs + "," + rhs				
		return text



	# method to generate a compilable test template function using 
	# the method call and natural language conditional statements identified 
	# identified using above defined methods for a given relevant section
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
			arg1 = re.search(argpattern,vardecl.split(".")[0])
			arg2 = re.search(argpattern,vardecl.split(".")[1])
			if arg1 and len(arg1.group()) >2:
				if len(args) > 0:
					args = args + "," + arg1.group().replace("(", "").replace(")", "")
				else:
					args = args + arg1.group().replace("(", "").replace(")", "")
			if arg1 and arg2 and len(arg2.group()) >2:
					args = args + "," + arg2.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
			elif arg2 and len(arg2.group()) >2:
				if len(args) > 0:
					args = args + ","  + arg2.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
				else:
					args = args + arg2.group().replace("(", "").replace(")", "").replace("[", "").replace("]", "")
		else:
			if len(args) > 0:
				args = args + "," +  vardecl.split("(")[1].split(")")[0]
			else:
				args = args + vardecl.split("(")[1].split(")")[0]

		if "arguments" in args:
			args = args.replace("arguments", "args")
		if "randominput" not in args and "randominput" in vardecl:
			if args=="":
				args = "randominput"
			else:
				args = "randominput," + args

		testfunction = "function test_" + testname + "("+ args + "){" 
		for i in range(1, len(testtemplate)):
			templatecount += 1
			if "if " not in testtemplate[i]: 
				continue
			
			# comment out following two lines to generate templates for more sections
			# this was made possible by modifying existing patterns and adding more patterns
			if "weak" in testfunction or "set_prototype" in testfunction or "regexp_prototype" in testfunction or "get_sharedarraybuffer" in testfunction or "get_map" in testfunction or "number_prototype_tofixed" in testfunction or "sharedarraybuffer" in testfunction or "array_prototype_concat" in testfunction or "array_prototype_push" in testfunction or "array_prototype_sort" in testfunction or "array_prototype_splice" in testfunction or "atomics_wait" in testfunction or "test_number_prototype_tostring" in testfunction or "test_string_raw" in testfunction:
				continue 

			test = ""
			testcondition = testtemplate[i]
			if "return" in testcondition:
				expectedinput = testcondition.split("return")[0].strip().split("if")[1].strip()
				expectedinput = self.convertTextToCode(expectedinput)
				expectedoutput = self.convertTextToCode(testcondition.split("return")[1].strip())
				if self.compiler == "rhino":
					test = "if (" + expectedinput + "){\n\t\t" + vardecl + "\n\t\t" + "new TestCase(\"" + testname + "\", \"" + testname + "\", " + expectedoutput + ", output);\n\t\ttest();\n\t\treturn;\n\t\t}"
				elif self.compiler == "node":
					if "NaN" == expectedoutput.strip():
						test = "if (" + expectedinput + "){\n\t\t" + vardecl + "\n\t\t" + "assert.strictEqual(isNaN(output), true);\n\t\tconsole.log(\"Good Test\");\n\t\treturn;\n\t\t}"
					else:
						test = "if (" + expectedinput + "){\n\t\t" + vardecl + "\n\t\t" + "assert.strictEqual(" + expectedoutput + ", output);\n\t\tconsole.log(\"Good Test\");\n\t\treturn;\n\t\t}"
				
				if test.count("(")!=test.count(")") or "performing" in test or "implementation" in test or "@@" in test or "«" in test or "[" in test or "either " in test or "finite " in test or "atomics_wait" in test or "concatenation" in test or "filler" in test or "searchLength" in test or "-searchStr" in test or " not " in test or "unit value of" in test: 
					continue
				testfunction = testfunction + "\n\t" + test
			if "throw" in testcondition:
				expectedinput = testcondition.split("throw")[0].split("if")[1].strip()
				expectedinput = self.convertTextToCode(expectedinput)
				expectedoutput = self.convertTextToCode(testcondition.split("throw")[1].strip())
				if self.compiler == "rhino":
					test = "if (" + expectedinput + "){\n\t\t try{\n\t\t\t" + vardecl + "\n\t\t\t return;"  + "\n\t\t}catch(e){\n\t\t\t" + "new TestCase(\"" + testname + "\", \"" + testname + "\", true, eval(e instanceof "  + expectedoutput + "));\n\t\t\ttest();\n\t\t\treturn;\n\t\t}\n\t}" 
				elif self.compiler == "node":
					test = "if (" + expectedinput + "){\n\t\t try{\n\t\t\t" + vardecl + "\n\t\t\tconsole.log(\"Bad Test/Failed Test\");\n\t\t\t return;"  + "\n\t\t}catch(e){\n\t\t\t" + "assert.strictEqual(true, eval(e instanceof "  + expectedoutput + "));\n\t\t\tconsole.log(\"Good Test\");\n\t\t\treturn;\n\t\t}\n\t}" 
				if test.count("(")!=test.count(")") or "performing" in test or "implementation" in test or "@@" in test or "«" in test or "[" in test or "either " in test or "finite " in test or  "atomics_wait" in test or "concatenation" in test or "filler" in test or "searchLength" in test or "-searchStr" in test or " not " in test or "unit value of" in test:
					continue 
				testfunction = testfunction + "\n\t" + test
		if self.compiler == "node":
			testfunction = testfunction + "\n\t\tconsole.log(\"OK Test\")\n}"  
		elif self.compiler == "rhino":	
			testfunction = testfunction + "\n}"  
		templates.append(testfunction)
		template = ''.join(templates)
		if len(testtemplate) > 1 and "if" in template and "unknown" not in template.split("){")[0] and  "NewTarget" not in template:
			self.test_templates[header] = template

	# method to filter out sections that do not encode 
	# testable behavior or that cannot be invoked directly
	# in JavaScript such as abstract operations	
	def isTestable(self, header, body):
		if ": " in header or "@@" in header or "%" in header:
				return False
		if (int(header.split(".")[0]) < 20): 
				return False
		if (")" in header and header.split(")")[1].strip() != ""):
				return False
		if "The abstract operation " in body:
			if body.split("The abstract operation")[1].split()[0].strip() in header:
				return False
		return True
		

	# This is the main method for this class. For each relevant section
	# identified, it first checks is the relevant sections is testable 
	# for example, it skips the sections describing abstract operations.
	# Next, if the section is testable, it extracts the method signature,
	# extracts the assignments and conditional statements, and finally
	# uses these to produce combilable test templates
	def generateTestTemplates(self, extracted_sections):
		numofsec = len(extracted_sections.keys())
		printProgressBar(0, numofsec, prefix = 'Generating Test Templates Progress:', suffix = 'Complete', length = 50)
		for idx, header in enumerate(sorted(extracted_sections)):
			header = header.replace("\xa0", " ")
			body = extracted_sections[header]
			printProgressBar(idx+1, numofsec, prefix = 'Generating Test Templates Progress:', suffix = 'Complete', length = 50)
			if self.isTestable(header, body) is False:
					continue
			method_signature = self.getMethodSignature(header)
			self.extractAssignmentAndConditionals(header, body, method_signature)
			self.generateCompilableTemplate(header)
		return self.test_templates	
