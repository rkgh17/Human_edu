import numpy as np
import pandas as pd

list_data=['2019-01-02',3.14,'ABC',100,True]
sr=pd.Series(list_data)
print(sr)
"""
0    2019-01-02
1          3.14
2           ABC
3           100
4          True
dtype: object
"""

dict_data={'a':1,'b':2,'c':3}
sr = pd.Series(dict_data)

print(type(sr))
print('-'*30)
print(sr)
"""
<class 'pandas.core.series.Series'>
------------------------------
a    1
b    2
c    3
dtype: int64
"""
print(sr.index)
print('-'*30)
print(sr.values)
"""
Index(['a', 'b', 'c'], dtype='object')
------------------------------
[1 2 3]
"""
