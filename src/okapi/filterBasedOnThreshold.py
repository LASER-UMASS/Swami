# this script is used to filter out the retrieved mappings for which 
# the similarity score obtained using the OKAPI model is above the 
# empirically determined threshold

import sys

retrieved_sections_file = open(sys.argv[1])  # path to the file containing retrieved mappings
threshold = 0.07                             # threshold
for line in retrieved_sections_file:
	score = float(line.split()[4].strip())
	if score >= threshold:
		print line.strip()

