import sys

concernfile = sys.argv[1] # path to rhino.concerns.arff file 
descfile = sys.argv[2]    # path to ECMA-262_v3_rel_sections.txt file
concernDesc = {}

f1 = open(descfile)  
for line in f1:
#	print line
	if "ID=" in line:
		cid = line.split("=")[1].strip()
	if "Description= " in line:
		csum = line.split("=")[1].strip()
		concernDesc[cid] = csum

#print concernDesc

outfile=open("ecma-262-v3-rel_sections.xml", "w")

outfile.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n<specrepository name=\"ECMA 262 v3\">\n")

f2 = open(concernfile)  
for line in f2:
	if " - " in line:
		print line
		line=line.replace("\"","")
		csummary = line.split(" - ")[-1].strip()
		cid = line.replace(csummary, "").strip()[:-1].strip()
		maincid = cid
		print cid, csummary, maincid
		if "/" in line:
			maincid = line.replace(csummary, "").strip()[:-1].strip().split("/")[-1].strip()
		cdescription = concernDesc[maincid]
		cdescription = cdescription.replace("\"", "&quot;")
		cdescription = cdescription.replace("&", "&amp;")
		cdescription = cdescription.replace("\'", "&apos;")
		cdescription = cdescription.replace("<", "&lt;")
		cdescription = cdescription.replace(">", "&gt;")

		print cid, maincid, csummary, cdescription	
		xmltemplate="<spec id=\"%s\">\n\t<specinformation>\n\t\t<summary>%s</summary>\n\t\t<description>%s</description>\n\t</specinformation>\n\t<fixedFiles>\n\t\t<file>dummy</file>\n\t</fixedFiles>\n</spec>\n"%(cid, csummary, cdescription)
		outfile.write(xmltemplate)
outfile.write("</specrepository>\n")
outfile.close()

