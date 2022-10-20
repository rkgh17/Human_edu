import numpy as np
import pandas as pd

# 시리즈 연산

# 시리즈 / 숫자
std={'국어':100,'영어':80,'수학':90}
student1 = pd.Series(std)
percentage=student1/200 # 학생의 과목별 점수를 200으로 나누기

# 시리즈 / 시리즈
student1 = pd.Series({'국어':100,'영어':80,'수학':90})
student2 = pd.Series({'수학':80,'국어':90,'영어':80})

add=student1+student2
sub=student1-student2
mul=student1*student2
div=student1/student2#사칙연산
result=pd.DataFrame([add,sub,mul,div],index=['addition', 'subtraction', 'multiplication', 'division'])
"""
print(result)
                     국어        수학      영어
addition         190.000000   170.000   160.0
subtraction       10.000000    10.000     0.0
multiplication  9000.000000  7200.000  6400.0
division           1.111111     1.125     1.0
"""

# NaN값이 있는 시리즈
student1 = pd.Series({'국어':np.nan,'영어':80,'수학':90})
student2 = pd.Series({'수학':80,'국어':90})
add=student1+student2
sub=student1-student2
mul=student1*student2
div=student1/student2
result=pd.DataFrame([add,sub,mul,div],index=['addition', 'subtraction', 'multiplication', 'division'])
"""
print(result)
            국어        수학  영어
addition       NaN   170.000 NaN
subtraction    NaN    10.000 NaN
multiplication NaN  7200.000 NaN
division       NaN     1.125 NaN
"""

# 연산 메소드
student1 = pd.Series({'국어':np.nan,'영어':80,'수학':90})
student2 = pd.Series({'수학':80,'국어':90})
sr_add=student1.add(student2,fill_value=0)
sr_sub=student1.sub(student2,fill_value=0)
sr_mul=student1.mul(student2,fill_value=0)
sr_div=student1.div(student2,fill_value=0)
result=pd.DataFrame([sr_add,sr_sub,sr_mul,sr_div],index=['덧샘', '뺄셈', '곱셈', '나눗셈'])
"""
print(result)
       국어     수학    영어
덧샘   90.0   170.000  80.0
뺄셈  -90.0    10.000  80.0
곱셈    0.0  7200.000   0.0
나눗셈   0.0     1.125   inf
"""


# 데이터프레임 연산
import seaborn as sns
# 데이터프레임 / 숫자
titanic = sns.load_dataset('titanic')
df=titanic.loc[:,['age','fare']]
"""
print(df.head()) #첫 5행
    age     fare
0  22.0   7.2500
1  38.0  71.2833
2  26.0   7.9250
3  35.0  53.1000
4  35.0   8.0500
"""
addition=df+10 # 모든 값 10 더함
"""
print(addition.head())
    age     fare
0  32.0  17.2500
1  48.0  81.2833
2  36.0  17.9250
3  45.0  63.1000
4  45.0  18.0500
"""

# 데이터프레임 / 데이터프레임
subtraction = addition - df
"""
print(subtraction.tail()) # 마지막 5행
      age  fare
886  10.0  10.0
887  10.0  10.0
888   NaN  10.0
889  10.0  10.0
890  10.0  10.0
"""