# script to compute the precision and recall to identify 
# the relevant sections using the OKAPI model

import sys

relevant_sections_file = open(sys.argv[1])
retrieved_sections_file = open(sys.argv[2])

relevantcount = 0
retrievedcount = 0
correctlyretrievedcount = 0

relevant = []
retrieved = []

for line in relevant_sections_file:
	relevant.append(line.strip())

for line in retrieved_sections_file:
	retrieved.append(line.strip())

correctlyretrieved = list(set(relevant) & set(retrieved))
relevantcount = float(len(relevant))
retrievedcount = float(len(retrieved))
correctlyretrievedcount = float(len(correctlyretrieved))

print "relevant count: ", relevantcount
print "retrieved count: ", retrievedcount 
print "correctly retrieved count: ", correctlyretrievedcount

precision = correctlyretrievedcount/retrievedcount*100.0
recall = correctlyretrievedcount/relevantcount*100.0

print "Precision: ", precision
print "Recall: ", recall

