import sys

devfile = open(sys.argv[1])
devplusswamifile = open(sys.argv[2])

methodlinecov = {}
methodbranchcov = {}


for line in devfile:
	line = line.split("::")
	methodlinecov[line[0].strip()] = float(line[1].replace("%","").strip())
	methodbranchcov[line[0].strip()] = float(line[2].replace("%","").strip())


for line in devplusswamifile:
	if "Total" in line:
		continue
	line = line.split("::")
	lineflag = False
	branchflag = False
	if float(line[1].replace("%", "").strip()) > methodlinecov[line[0].strip()]:
		lineflag = True
		
	if float(line[2].replace("%", "").strip()) > methodbranchcov[line[0].strip()]:
		branchflag = True

	if lineflag is True or branchflag is True:
		print line[0].strip(), "::", float(line[1].replace("%", "").strip()) - methodlinecov[line[0].strip()], "::", float(line[2].replace("%", "").strip()) - methodbranchcov[line[0].strip()]

