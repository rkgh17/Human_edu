import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_excel('D:/AI_Class/Python/bigdata/pandas/남북한발전전력량.xlsx',engine='openpyxl')
df_ns=df.iloc[[0,5],3:]#남북 발전량 합계 데이터 추출
df_ns.index=['South','North']#행 인덱스 변경
#print(df_ns)
df_ns.columns=df_ns.columns.map(int)#열 이름의 자료형을 정수형으로 변경
print(df_ns.head())
df_ns.plot()

tdf_ns=df_ns.T
print(tdf_ns.head())
tdf_ns.plot()#행/열 전치하여 다시 그리기


#누락값을 앞 데이터로 채움
df=pd.read_excel('D:/AI_Class/Python/bigdata/pandas/시도별 전출입 인구수.xlsx',engine='openpyxl',header=0)
df=df.fillna(method='ffill')

#서울에서 다른 지역으로 이동한 데이터만 추출
mask = (df['전출지별'] == '서울특별시')&(df['전입지별'] != '서울특별시')
df_seoul = df[mask]
df_seoul = df_seoul.drop(['전출지별'],axis=1)
df_seoul.rename({'전입지별':'전입지'}, axis=1,inplace=True)
df_seoul.set_index('전입지',inplace=True)

#서울에서 경기도로 이동한 인구 데이터 값만 선택
sr_one = df_seoul.loc['경기도']
print(sr_one)
#x,y축 데이터를 plot함수에 입력
plt.plot(sr_one.index, sr_one.values)

#히스토그램 137p
plt.style.use('classic')
df=pd.read_csv('D:/AI_Class/Python/bigdata/pandas/auto-mpg.csv',header=None)
df.columns = ['mpg','cylinders','displacement','horsepower','weight','acceleration','model year','origin','name']
df['mpg'].plot(kind='hist',bins=10,color='coral',figsize=(10,5))
plt.title('Histogram')
plt.xlabel('mpg')
plt.show()

#산접도 139p
plt.style.use('default')
df=pd.read_csv('D:/AI_Class/Python/bigdata/pandas/auto-mpg.csv')
df.columns = ['mpg','cylinders','displacement','horsepower','weight','acceleration','model year','origin','name']
# df['mpg'].plot(kind='hist',bins=10,color='coral',figsize=(10,5))
df.plot(kind='scatter',x='weight',y='mpg',c='cyan',s=10,figsize=(10,5))
plt.title('Scatter Plot - mpg vs weight')
# plt.xlabel('mpg')
plt.show()