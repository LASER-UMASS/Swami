"""Extract all tables from an html file, printing and saving each to csv file."""

import pandas as pd
import sys

df_list = pd.read_html(sys.argv[1])
df = pd.DataFrame((df_list[0]))
for index, row in df.iterrows():
    print row['Element'],"::", row['Cov.'], "::", row['Cov..1']


