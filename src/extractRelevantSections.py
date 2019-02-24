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
# This script is used to extract the relevant sections (sections which are implemented
# and for which tests should be created) from the specification document using 
# regular expressions which are composed of keywords, POS tags and wild card characters.
# This is invoked by the main driver program swami.py
# ==============================================================================

from stanfordcorenlp import StanfordCoreNLP
import sys
import re
from time import sleep
from printprogress import printProgressBar


conditionalpattern1 = re.compile("If .* return .*")
conditionalpattern2 = re.compile("If .* the result is .*")
exceptionpattern = re.compile("throw a .* exception")
DEBUG = False


class RelevantSection(object):
	def __init__(self):
		self.relevant_sections = {}	# dictionary that stores the relevant sections extrated from specification document
		self.nlp = StanfordCoreNLP(r'lib/stanford-corenlp-full-2018-02-27')
	
	# method to tokenize a sentence and annotate it with POS tags 
	def tokenize(self, sentence):
		postags = self.nlp.pos_tag(sentence)
		return postags
	
	# method to check if the title of the section is relevant (contains method signature) 
	def checkIfRelevantHeader(self, line, pos_tokens):
		relsec = False
		s = 0
		if "If" in line or "Let" in line or "Return" in line or "Else" in line or line.strip().endswith(".") or line.strip().endswith(",") or " a " in line or " an" in line or " the" in line or "”" in line or " in" in line or " In" in line or " at" in line:
			return False
		for i in range(len(pos_tokens)):
			if "IN" in pos_tokens[i][1] or "DT" in pos_tokens[i][1] or "CC" in pos_tokens[i][1]:
				return False
		if len(pos_tokens) > 1 and "CD" in pos_tokens[0][1].strip() and pos_tokens[len(pos_tokens)-1][0] != ".":
			for i in range(1, len(pos_tokens)):
				if "NN" in pos_tokens[i][1] or "NNP" in pos_tokens[i][1] or "NNS" in pos_tokens[i][1]:
					return True	
		return relsec
	
	# main method for this file. It takes the path to the specification document 
	# and returns a dictonary of extracted sections where key is the section title
	# and value is the section body
	def extractSections(self, path_to_spec_doc):
		headers = []
		extracted_sections = {}
		spec_doc = open(path_to_spec_doc)
		relsec = False
		checkheader = True
		header = ""
		body = ""
		document = ""
		linecount = 0
		doclen = len(spec_doc.read().split("\n"))
		spec_doc = open(path_to_spec_doc)
		printProgressBar(0, doclen, prefix = 'Extracting Header Progress:', suffix = 'Complete', length = 50)
		# loop through the document to extract the header sentences and store all the content
		for line in spec_doc:
			linecount += 1
			printProgressBar(linecount + 1, doclen, prefix = 'Extracting Header Progress:', suffix = 'Complete', length = 50)
			document += line 	
			if len(line) > 1:
				pos_tokens = self.tokenize(line.strip().replace("[", "").replace("]", ""))
				isheader = self.checkIfRelevantHeader(line, pos_tokens)
				if isheader is True:
					header = line.strip()
					headers.append(header)
					continue	
					

		# loop through the document (stored in memory) to extract the body correspoding to headers extracted
		startsection = False
		body = ""
		header = ""
		doclines = document.split("\n")
		for idx in range(len(doclines)):
			line = doclines[idx]
			if line.strip() in headers or idx == len(doclines) - 1:
				if header != "":
					if len(body) > 1:
						extracted_sections[header] = body
				header = line
				body = ""
				continue
			elif len(line) > 1:
				body += line.strip() + "\n"
		
		return extracted_sections

	# method that uses patterns to determine if a section contains a boundary condition or exception
	def isSectionRelevant(self, header, body):
		isrelhead = False
		isrelbody = False
		if len(header.split())>=3:
			if "[[" in header.split()[1]:
				return False

			if "(" not in header and ")" not in header and "." not in header.split()[1] and "." not in header.split()[2]: 
				return False
			else:
				isrelhead = True	
		
		if isrelhead is False and "." not in header.split()[1]:
			return False
			
		for line in body.split("\n"):
			line = line.replace("\xa0", " ")
			if (re.search(conditionalpattern1, line) or re.search(conditionalpattern2, line) or re.search(exceptionpattern, line))  and isrelhead is True:	
				isrelbody = True
				break
		if isrelbody is False:
			return False
			
		header_tokens = self.tokenize(header.strip().replace("[", "").replace("]", ""))
		for i in range(len(header_tokens)):	
			if "-LRB-" in header_tokens[i][1]:
				for j in range(i, len(header_tokens)):
					if "-RRB-" in header_tokens[j][1] and j == len(header_tokens) - 1:
						return True
		return isrelhead
	
	# This is an driver method that invokes the main method (extractSections). 
	# The for loop is mostly used for debigging purposes.
	def getRelevantSections(self, path_to_spec_doc):
		extracted_sections = self.extractSections(path_to_spec_doc)
		printProgressBar(0, len(extracted_sections), prefix = 'Extracting Relevant Specifications Progress:', suffix = 'Complete', length = 50)
		count = 0
		for header in sorted(extracted_sections):
			count += 1
			printProgressBar(count + 1, len(extracted_sections), prefix = 'Extracting Relevant Specifications Progress:', suffix = 'Complete', length = 50)
			body = extracted_sections[header]
			if self.isSectionRelevant(header, body):
				self.relevant_sections[header] = body
				if DEBUG:
					print("\n######################################################")
					print("===== HEADER ==================================== ")
					print(header)
					print("=====  BODY  ==================================== ")
					print(body)
					print("#########################################################\n")
		sleep(0.2)
		return self.relevant_sections
