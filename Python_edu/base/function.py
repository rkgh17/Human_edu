"""
같은 동작들의 모음

def 함수명(매개변수1, ....매개변수n):
    실행문
    [return 반환값]

"""
def displaymenu(menulist):#데이터 출력 함수
    ndx=1
    for m in menulist:
        print('%2d | %-10s | %4d원'%(ndx, m['name'], m['price']))
        ndx+=1

menu=[]

f=open('d:/AI_Class/Python/file/menu/menu.txt','w')
while True:
    name=input('메뉴를 입력하시오 : ')
    if name=='':
        break
    price=int(input('가격을 입력하시오 : '))
    f.write(name+', '+str(price)+'\n')
f.close()

print('-'*80)
f=open('d:/AI_Class/Python/file/menu/menu.txt','r')
line=f.readline()
while line!='':
    ar=line.split(',')
    m={'name':ar[0], 'price':int(ar[1])}
    menu.append(m)
    line=f.readline()
f.close()

displaymenu(menu)

# 전역변수 지역변수
def f1(x):
    # print(f'x:[{x}] | n:[{n}]')
    n=15
    print(f'x:[{x}] | n:[{n}]')

n=10 # 이것도 사실상 지역변수.
print(f'global : n [{n}]')
f1(5)
print(f'global : n [{n}]')

def add(x,y):
    return x+y
i=add(3,5)
print(i)

#반환값 없는 구구단
def multi(x,y):
    str=f'{x} * {y} = {x*y}'
    print(str)
for i in range(2,10):
    for j in range(1,10):
        multi(i,j)

#반환값 있는 구구단
def multi_return(x,y):
    str=f'{x} * {y} = {x*y}'
    return str
for i in range(2,10):
    for j in range(1,10):
        retstr = multi_return(i,j)
        print(retstr)

# 재귀함수
def factorial(n):
    if n==1:
        print(f'[{n}] ',end='')
        return 1
    else:
        print(f'[{n}] + ',end='')
        return n*factorial(n-1)

x=factorial(4)
print('= ',x)

#재귀함수 누적합
def all_sum(n):
    if n==1:
        print(f'[{n}] ',end='')
        return 1
    else:
        print(f'[{n}] + ',end='')
        return n+all_sum(n-1)
x=all_sum(10)
print('= ',x)