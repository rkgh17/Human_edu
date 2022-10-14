import numpy as np
import pandas as pd

#to_csv
data={'name':['Jerry','Riah','Paul'],'algol':['A','A+','B'],'basic':['C','B','B+'],'c++':['B+','C','C+']}

df=pd.DataFrame(data)
df.set_index('name',inplace=True)
print(df)

df.to_csv('D:/AI_Class/Python/bigdata/pandas/df_sample.csv')