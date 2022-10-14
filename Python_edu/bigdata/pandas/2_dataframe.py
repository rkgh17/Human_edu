import numpy as np
import pandas as pd

dict_data={'c0':[1,2,3],'c1':[4,5,6],'c2':[7,8,9],'c3':[10,11,12],'c4':[13,14,15]}
df = pd.DataFrame(dict_data)
print(df)
"""
   c0  c1  c2  c3  c4 ->헤더
0   1   4   7  10  13
1   2   5   8  11  14
2   3   6   9  12  15
"""

df=pd.DataFrame([[15,'남','덕영중'],[17,'여','수리중'],[14,'공','영창초']],
                index=['준서','예은','현지'],#행이름
                columns=['성별','나이','학교']#열이름
               )
print(df)
"""
    성별 나이   학교 --columns
준서  15  남  덕영중
예은  17  여  수리중
현지  14  공  영창초
 |
index
"""


df=pd.DataFrame([['John',44445555,'M','LA'],['Jane',43215452,'F','LV'],['Jacob',77778888,'M',None],['Johanson',12345432,'F','MI']],
                index=['1st','2nd','3rd','4th'],
                columns=['name','mobile','gender','city']
               )
print(df)
"""
         name    mobile gender  city
1st      John  44445555      M    LA
2nd      Jane  43215452      F    LV
3rd     Jacob  77778888      M  None
4th  Johanson  12345432      F    MI
"""
#행/열 모두변경 -> 다써줘야함
df.index=['1ST','2ND','3RD','4TH']
df.columns=['이름','모바일','성별','도시']
print(df)
"""
           이름       모바일 성별    도시
1ST      John  44445555  M    LA
2ND      Jane  43215452  F    LV
3RD     Jacob  77778888  M  None
4TH  Johanson  12345432  F    MI
"""
#특정 행/열 변경
df.rename(index={'1ST':'첫줄','3ND':'셋째','2ND':'둘째'})
df.rename(columns={'도시':'City','모바일':'Mobile','성별':'Gender'})
"""
	이름	Mobile	Gender	City
1ST	John	44445555	M	LA
2ND	Jane	43215452	F	LV
3RD	Jacob	77778888	M	None
4TH	Johanson12345432	F	MI
"""

#df.drop
#행 (axis=0(default)) / 열 (axis=1)
#inplace=True : 진짜 삭제 / False(default) : 진짜 삭제x
df.drop(['2ND','3RD'])
"""
	이름	모바일	성별	도시
1ST	John	44445555	M	LA
4TH	Johanson12345432	F	MI
"""
df.drop({'모바일','도시'},axis=1)
"""
    이름	성별
1ST	John	M
2ND	Jane	F
3RD	Jacob	M
4TH	Johanson	F
"""
# 행 선택 : loc/iloc
exam_data={'이름':['서준','우현','인아'],
           '수학':[90,80,70],
           '영어':[98,89,95],
           '음악':[85,95,100],
           '체육':[100,90,90]}
df=pd.DataFrame(exam_data)
"""
   이름  수학  영어   음악   체육
0  서준  90    98     85    100
1  우현  80    89     95     90
2  인아  70    95    100     90
"""
df.loc['서준'] #서준 행
df.iloc[0]

df.loc[['서준','우현']] # 여러 개의 행
df.iloc[[0],[1]]

df.loc['서준':'우현'] # 서준~우현 행
df.iloc[0:1]

df.iloc[::1] # 간격 1


# 열 선택
df['수학']
df[['음악','체육']] # 여러 개 열 선택


# 원소 선택
df.loc['서준','음악'] # 서준행 영어열 객체 반환
df.iloc[0,2]

df.loc['서준',['음악','체육']] # 서준행의 음악/체육열 객체 반환
df.iloc[0,[2,3]]
df.loc['서준','음악':'체육'] # 서준행 / 음악부터 체육 열
df.iloc[0,2:]

df.loc[['서준','우현'],['음악','체육']] # 서준과 우현 행 / 음악과 체육 열
df.iloc[[0,1],[2,3]]
df.loc['서준':'우현','음악':'체육'] # 서준부터 우현 행 / 음악부터 체육 열
df.iloc[0:2,2:]


# 열 추가
df['국어']=80 # 국어 열을 80으로 일괄추가

# 행 추가
df.loc[3] = 0 # 인덱스가 3인 행을 0으로 일괄추가
df.loc[4] = ['동규',90,80,70,60]
df.loc[5] = df.loc[3] # 기존 행 복사

# 원소 값 변경

# 서준의 체육점수 변경
df.iloc[0][3]
df.loc['서준']['체육'] = 90

# 서준의 음악 체육 점수 변경
df.loc['서준',['음악','체육']] = 50
df.loc['서준',['음악','체육']] = 100, 50

# 행/열 위치 바꾸기
df=df.transpose()
df=df.T

#인덱스 활용 / set_index()
ndf = df.set_index(['이름']) # 인덱스를 이름으로 설정
ndf2 = df.set_index('음악') # 음악 열을 인덱스로 설정
ndf3 = df.set_index(['수학','음악']) # 수학 음악 열을 인덱스로 설정

#행 인덱스 재배열 
#새로운 인덱스가 추가되면 그에 맞는 모든 열은 NaN 입력
dict_data = {'c0':[1,2,3],'c1':[4,5,6],'c2':[7,8,9],'c3':[10,11,12],'c4':[13,14,15]}
df=pd.DataFrame(dict_data, index=['r0','r1','r2'])

#reindex()
new_index=['r0','r1','r2','r3','r4']
ndf=df.reindex(new_index,fill_value=0) # NaN을 0으로 변경
ndf=df.reindex(['r1','r4'],fill_value=0) # r1,r4 인덱스에 남아있는 값만 보존 / 나머지는 0

#행 인덱스 초기화 / reset_index()
ndf=df.rest_index() # 인덱스를 0~...으로 / 기존에 있던 인덱스는 열로 변경

#행 인덱스 기준 정렬 / sort_index()
ndf=df.sort_index(ascending=False) # 내림차순 정렬

#특정 열의 데이터 값을 기준으로 데이터프레임 정렬 sort_values()
ndf=df.sort_values(by='c1',ascending=False) # c1을 기준으로 내림차순 정렬