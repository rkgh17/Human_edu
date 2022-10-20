"""
CSV (Comma-Separtated Values) : ,로 구분 / .csv
Exel (MS) / .xlsx
JSON () : 키:값 쌍으로 구분 : .txt
"""
from urllib import request
import numpy as np
import pandas as pd
from bs4 import BeautifulSoup as bs
import requests
import re

#CSV
file_path = 'D:/AI_Class/Python/bigdata/pandas/read_csv_sample.csv'
df1 = pd.read_csv(file_path)
print(df1)
"""
   c0  c1  c2  c3
0   0   1   4   7
1   1   2   5   8
2   2   3   6   9
"""
print()

#옵션
# sep(또는 delimiter) : default ,
# header : default0
# index_col : 행 인덱스 열 번호
# names : 열 이름으로 사용할 문자열 리스트
# skiprows : 처음 몇 줄을 스킵할 것인지. 스킵범위 리스트 가능
# parse_dates : 날자 텍스트를 datetime64로 변환. default False
# skip_folder : 마지막 몇줄 skip
# encoding : 텍스트 인코딩 종류 지정
df2=pd.read_csv(file_path,header=None) 
print(df2)
print()

df3=pd.read_csv(file_path,index_col=None) 
print(df3)
print()

df4=pd.read_csv(file_path,index_col='c0') 
print(df4)
print()

#Excel
df1=pd.read_excel('D:/AI_Class/Python/bigdata/pandas/남북한발전전력량.xlsx',engine='openpyxl')#header0
df2=pd.read_excel('D:/AI_Class/Python/bigdata/pandas/남북한발전전력량.xlsx',engine='openpyxl',header=None)#header0
print(df1)
print()
print(df2)

#JSON
df=pd.read_json('D:/AI_Class/Python/bigdata/pandas/read_json_sample.json')
print(df)

#HTML
url='D:/AI_Class/Python/bigdata/pandas/sample.html'
tables = pd.read_html(url)
print(len(tables))
print()
for i in range(len(tables)):
    print('tables[%s]'%i)
    print(tables[i])
    print()
    
df=tables[1]
df.set_index(['name'],inplace=True)
print(df)
print()

#BeautifulSoup
from bs4 import BeautifulSoup as bs
import requests
import re

url='https://en.wikipedia.org/wiki/List_of_American_exchange-traded_funds'
resp=requests.get(url)
soup=bs(resp.text,'lxml')
rows=soup.select('div > ul > li')
etfs={}

for row in rows:
    try:
        str=row.text #전체 문자열
        ndx=str.find('(') # 첫 괄호 의 위치
        if ndx<0:
            continue
        etf_name=str[:ndx] # 처음부터 첫 괄호까지 추출
        etf_name=etf_name.strip() #앞뒤 공백제거
#         print(etf_name)
#         print('\n')

        ndx1=str.find(':',ndx)#괄호 뒤 문자열의 :위치
        
        if ndx1>-1:#콜론이 있을때
            etf_market=str[ndx+1:ndx1]#첫 괄호 다음부터 콜론 전까지
            etf_market=etf_market.strip()
#             print(etf_market)
#             print('\n')
            
            ndx2=str.find(')')#마지막 괄호의 인덱스
            etf_ticker=str[ndx1+1:ndx2]#콜론부터 마지막 괄호까지
            etf_ticker=etf_ticker.strip()
            
            etfs[etf_ticker] = [etf_market,etf_name]
            
            
#             print(f'etf_market:[{etf_market}]')
#             print(f'etf_ticker:[{etf_ticker}]')
            
        else:#콜론이 없을때
            ndx2=str.find(')')#마지막 괄호의 위치
            str1=str[ndx+1:ndx2]#콸호 안의 문자열 추출
            str1=str1.strip()
            
            ndx1=str1.rfind(' ')#맨뒤서부터 첨 나오는 공백의 위치

            if ndx1>-1:
                etf_market=str1[:ndx1]#첨부터 rfind
                etf_market=etf_market.strip()
                
                etf_ticker=str1[ndx1:]#rfind부터 마지막
                etf_ticker=etf_ticker.strip()
                
#                 print(f'etf_market:[{etf_market}]')
#                 print(f'etf_ticker:[{etf_ticker}]')
                etfs[etf_ticker] = [etf_market,etf_name]

    except ValueError as err:
        pass
print(etfs)
print('-'*30)
df=pd.DataFrame(etfs)
print(df)
