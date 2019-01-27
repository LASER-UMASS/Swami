import sys

esfile1 = open(sys.argv[1])
esfile2 = open(sys.argv[2])
esfile3 = open(sys.argv[3])
esfile4 = open(sys.argv[4])
esfile5 = open(sys.argv[5])

cov = 0.0
count = 0.0
for line in esfile1:
	if "Coverage" in line:
		continue
	count += 1.0
	cov += float(line.split(",")[2].strip())

for line in esfile2:
	if "Coverage" in line:
		continue
	count += 1.0
	cov += float(line.split(",")[2].strip())

for line in esfile3:
	if "Coverage" in line:
		continue
	count += 1.0
	cov += float(line.split(",")[2].strip())

for line in esfile4:
	if "Coverage" in line:
		continue
	count += 1.0
	cov += float(line.split(",")[2].strip())

for line in esfile5:
	if "Coverage" in line:
		continue
	count += 1.0
	cov += float(line.split(",")[2].strip())

average = cov/count*100

print "The average statement coverage of EvoSuite-generated tests on 251 Rhino classes is: ", average, "%"
