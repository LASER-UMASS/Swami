import sys

concernmappingfile = open(sys.argv[1])
BLUirResults = open(sys.argv[2])

# to store ground-truth
ConcernClasses = {}
ClassConcerns = {}

# to store ground-truth
ConcernMethods = {}
MethodConcerns = {}

# to store results obtained using BLUir
ConcernClassesResults = {}
ClassConcernsResults = {}

def extractClassName(method):
	methodentities = method.split(".")
	classname = ""
	for e in methodentities[0:-1]:
		classname = classname + e + "."
				
	return classname[0:-1]

def updateClassDict(classname, concerns):
	for c in concerns:
		if c[1]=="/":
			c = c[1:]
		csummary = c.split(" - ")[-1].strip()
		cid = c.replace(csummary, "").strip()[:-1].replace("'","").strip()[1:]

		if cid == "":
			return
		if cid not in ConcernClasses:
			ConcernClasses[cid] = classname
		else:
			existingclasses =  ConcernClasses[cid]
			if classname not in existingclasses:
				ConcernClasses[cid] = existingclasses + "::" + classname
	
		if classname not in ClassConcerns:
			ClassConcerns[classname] = cid
		else:
			existingconcerns =  ClassConcerns[classname]
			if cid not in existingconcerns:
				ClassConcerns[classname] = existingconcerns + "::" + cid

def updateMethodDict(methodname, concerns):
	for c in concerns:
		if c[1]=="/":
			c = c[1:]
		csummary = c.split(" - ")[-1].strip()
		cid = c.replace(csummary, "").strip()[:-1].replace("'","").strip()[1:]
		if cid == "":
			return
		if cid not in ConcernMethods:
			ConcernMethods[cid] = methodname
		else:
			existingmethods =  ConcernMethods[cid]
			ConcernMethods[cid] = existingmethods + "::" + methodname
	
		if methodname not in MethodConcerns:
			MethodConcerns[methodname] = cid
		else:
			existingconcerns =  MethodConcerns[methodname]
			MethodConcerns[methodname] = existingconcerns + "::" + cid

# total number of correctly retrieved / total number of retrieved
def precision():
	queryid=0
	correctlyretrieved = 0
	totalretrieved = 0
	for cid in sorted(ConcernClasses.keys()):				# manually mapped concern
		if cid in ConcernClassesResults.keys():				# check if BLUir mapped this concern with atleast one correct class				
			queryid += 1
			correctlyretrievedperquery = 0
			totalretrievedperquery = 0
			results = ConcernClassesResults[cid]			
			if "::" in results:
				results = results.split("::")
				totalretrievedperquery = len(results)
				totalretrieved += len(results)
				for result in results:
					classname = result.split(",")[0]
					if classname in ConcernClasses[cid]:
						correctlyretrieved += 1
						correctlyretrievedperquery += 1
			else:
				classname = results.split(",")[0]
				totalretrievedperquery = 1
				totalretrieved += 1
				if classname in ConcernClasses[cid]:
					correctlyretrieved += 1
					correctlyretrievedperquery += 1
			precisionperquery = round(float((float(correctlyretrievedperquery)/float(totalretrievedperquery)) * 100.0),2)
			#print "Q" + str(queryid), ";", precisionperquery 		
		#else:
		#	print "Q" + str(queryid), ";", 0.0 		
#			print "Concern ", cid, " could not be mapped to code by BLUir"
			
	print correctlyretrieved, " classes retrieved correctly out of " , totalretrieved, " total classes retrieved"
	print "Precision overall = ",round(float((float(correctlyretrieved)/float(totalretrieved)))*100.0,2) , "%"		

# total number of correctly retrieved / actual number of correct traces
def recall():
	queryid = 0
	correctlyretrieved = 0
	actualnumber = 0
	for cid in sorted(ConcernClasses.keys()):					# manually mapped concern
		correctlyretrievedperquery = 0
		actualnumberperquery = 0
		r = ConcernClasses[cid]
		if "::" in r:
			actualnumberperquery = len(r.split("::"))
		else:
			actualnumberperquery = 1
		actualnumber += actualnumberperquery
		if cid in ConcernClassesResults.keys():				# check if BLUir mapped this concern				
			queryid += 1
			results = ConcernClassesResults[cid]			
			if "::" in results:
				results = results.split("::")
				for result in results:
					classname = result.split(",")[0]
					if classname in ConcernClasses[cid]:
						correctlyretrievedperquery += 1			# count the number of correctly retrieved mappings for a query
			else:
				classname = results.split(",")[0]
				if classname in ConcernClasses[cid]:
					correctlyretrievedperquery += 1
			correctlyretrieved += correctlyretrievedperquery			# count correctly retrieved classes until now
			recallperquery = float((float(correctlyretrievedperquery)/float(actualnumberperquery)))*100.0		
			#print "Q" + str(queryid), ";", recallperquery 		
		#else:
		#	print "Q" + str(queryid), ";", 0.0 		
#			print "Concern ", cid, " could not be mapped to code by BLUir"
			
#	print correctlyretrieved , " classes retrieved correcly out of " , actualnumber, " actual number of classes"
	print "Recall overall = ", round(float((float(correctlyretrieved)/float(actualnumber)))*100.0,2) , "%"		
	
def recallAtTopN():
	mappedcount = 0
	totalcount = 0
	for cid in ConcernClasses.keys():					# manually mapped concern
		totalcount += 1
		if cid in ConcernClassesResults.keys():				# check if BLUir mapped this concern with atleast one correct class				
			results = ConcernClassesResults[cid]			
			if "::" in results:
				results = results.split("::")
				for result in results:
					classname = result.split(",")[0]
					if classname in ConcernClasses[cid]:
						mappedcount += 1
						break
			else:
				classname = results.split(",")[0]
				if classname in ConcernClasses[cid]:
					mappedcount += 1
#		else:
#			print "Concern ", cid, " could not be mapped to code by BLUir"

	print mappedcount , " concerns mapped out of " , totalcount
	print "RecallAtTopN = ", mappedcount		

def meanReciprocalRank():
	reciprocalranksum = 0
	totalcount = 0
	querycount = 0
	for cid in ConcernClasses.keys():					# manually mapped concern
		totalcount += 1
		if cid in ConcernClassesResults.keys():				# check if BLUir mapped this concern with atleast one correct class and what is its rank				
			querycount += 1
			results = ConcernClassesResults[cid]			
			if "::" in results:
				results = results.split("::")
				for result in results:
					classname = result.split(",")[0]
					rank = result.split(",")[1]
					if classname in ConcernClasses[cid]:
						reciprocalranksum += float(1.0)/float(rank)
						break
			else:
				classname = results.split(",")[0]
				rank = results.split(",")[1]
				if classname in ConcernClasses[cid]:
					reciprocalranksum += float(1.0)/float(rank)
#		else:
#			print "Concern ", cid, " could not be mapped to code by BLUir"

#	print querycount , " concerns mapped out of " , totalcount
#	print "Reciprocak rank sum for ", querycount, " queries = ", reciprocalranksum
	print "MRR = ", round(float((float(reciprocalranksum)/float(querycount))),2)
	



def averagePrecision(query):
	relevantRanks = []
	APsum = 0
	results = ConcernClassesResults[query]
#	print "Query = ", query
	if "::" in results:
		results = results.split("::")
		for result in results:
			classname = result.split(",")[0]
			rank = int(result.split(",")[1])
			if classname in ConcernClasses[query]:
				relevantRanks.append(rank)	
	else:
		classname = results.split(",")[0]
		rank = int(results.split(",")[1])
		if classname in ConcernClasses[query]:
			relevantRanks.append(rank)	
	
	M = len(relevantRanks)
#	print "RELEVANT RANKS FOR THIS QUERY ARE: ", relevantRanks
	for k in relevantRanks:
#		print "###########RANK: ", k
		# compute P(k)
		totalrelevant = 0
		if type(results)==list:
			for result in results:
				classname = result.split(",")[0]
				rank = int(result.split(",")[1])
				if rank <= k and (classname in ConcernClasses[query]):
					totalrelevant = totalrelevant + 1		
		else:
			classname = results.split(",")[0]
			rank = int(results.split(",")[1])
			if rank == k and classname in ConcernClasses[query]:
				totalrelevant += 1		
				
#		print "#############TOTAL RELEVANT: ", totalrelevant
		pk = float(totalrelevant)/float(k)
#		print "P(k): ", pk	
		APsum += pk	
#		print "APsum: ", APsum
	# compute average precision		
	if float(M) > 0:
		AP = float(APsum)/float(M)
	else:
		AP = 0.0
	return AP

def meanAveragePrecision():
	totalcount = 0
	querycount = 0
	sumAPQ = 0
	for cid in ConcernClasses.keys():					# manually mapped concern
		totalcount += 1
		if cid in ConcernClassesResults.keys():				# check if BLUir mapped this concern with atleast one correct class and what is its rank				
			querycount += 1
			AP = averagePrecision(cid)	
			sumAPQ += AP
#		else:
#			print "Concern ", cid, " could not be mapped to code by BLUir"

#	print querycount , " concerns mapped out of " , totalcount
#	print "Sum of average precisions for ", querycount, " queries = ", sumAPQ
	print "MAP = ", round(float((float(sumAPQ)/float(querycount))),2)


for line in concernmappingfile:
	if ",method," in line:
		line = line.split("method")
		methodname = line[0][0:-1].replace("'","").strip()
		classname = extractClassName(methodname).replace("'","").strip()
		concerns = line[1].split(",")[1:]
		if concerns[0] != "''\n" and concerns[0] != '':
			updateMethodDict(methodname, concerns)
			updateClassDict(classname, concerns)
	#	else:
	#		print "no concerns exist for method ", methodname, concerns

for line in BLUirResults:
	if "Q0" in line:
		line = line.split("Q0")
		cid = line[0].strip()
		results = line[1].split(" ")
		classname = results[1].strip()[:-5]
		rank = results[2].strip()
		score = results[3].strip()

		if cid != "" and cid not in ConcernClassesResults:
			ConcernClassesResults[cid] = classname + "," + rank + "," + score
		else:
			existingclasses =  ConcernClassesResults[cid]
			ConcernClassesResults[cid] = existingclasses + "::" + classname + "," + rank + "," + score
	
		if classname not in ClassConcernsResults:
			ClassConcernsResults[classname] = cid
		else:
			existingconcerns =  ClassConcernsResults[classname]
			ClassConcernsResults[classname] = existingconcerns + "::" + cid

precision()
recall()
recallAtTopN()
#meanReciprocalRank()
meanAveragePrecision()


totalmappings = 0
for k in sorted(ConcernClasses.keys()):
	totalmappings += len(ConcernClasses[k])

totalmappingsresults = 0
for k in sorted(ConcernClassesResults.keys()):
	totalmappingsresults += len(ConcernClassesResults[k])

commonconcerns = 0
for k1 in sorted(ConcernClasses.keys()):
	for k2 in sorted(ConcernClassesResults.keys()):
		if k1==k2:
			commonconcerns += 1
			break


print "TOTAL #CONCERNS MAPPED IN ORACLE = ", len(ConcernClasses.keys());
print "TOTAL #MAPPINGS IN ORACLE = ", totalmappings
print "TOTAL #CONCERNS MAPPED IN RESULTS = ", len(ConcernClassesResults.keys());
print "TOTAL #MAPPINGS IN RESULTS = ", totalmappingsresults
print "TOTAL #COMMON CONCERNS BETWEEN RESULTS AND ORACLE = ", len(ConcernClasses.keys());
print "TOTAL #CLASSES IN ORACLE = ", len(ClassConcerns.keys());

















