import random

lunch=[]
f=open('d:/AI_Class/Python/todayLunch/lunch.txt','r', encoding='UTF-8')
line=f.readline()
while line!='':
    ar=line.split(',')
    lunchlist={'num':int(ar[0]),'name':ar[1]}
    lunch.append(lunchlist)
    line=f.readline()
f.close()

# print(lunch)
a=0
# while a!=0:
today=random.randint(0,len(lunch)-1)
print('오늘의 메뉴는!!!!!!!!!!!!!!!!!!!!!!')
print()
print(lunch[today]['name'])
    # a=int(input('다시?/(0)'))
