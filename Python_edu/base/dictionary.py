"""
인덱스가 없다.
KEY : VALUE
key : 정수,실수,문자열만 가능

d = {'name':'John', 'birthday':'1225', 'mobile':'44445555'}
d['name'] #-> John

n='name'
d[n] #->John
d[n] = 'Smith' #값 변경

d['city'] = 'Seoul' #추가

del d['mobile'] #삭제

for문
for i in dict: -> KEY

for i in dict:
    print(dict[i]) -> VALUE

for i,j in dict.items():
    print('key[{}] : value[{}]'.format(i,j)) -> VALUE

"""