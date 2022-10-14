# 구구단 2단부터 9단까지 출력
for i in range(2,10):
    for j in range(1,10):
        print(f'{i} * {j} = {i*j}')
    print()

# while 구구단
i=2
while i<10:
    j=1
    while j<10:
        print(f'{i} * {j} = {i*j}')
        j+=1
    i+=1
    print()
print('구구단 종료')

#fibonacci series 피보나치 수열
a=0
b=1
c=a+b
while c<=10000:
    print(f'{c}',end=" ")
    a=b
    b=c
    c=a+b

# prime number (소수)
for i in range(2,1001):
    cnt=0
    for j in range(1,i):
        if(i%j==0):
            cnt+=1

    if(cnt==1):
        print(f'{i}',end=" ")

for i in range(2,1001):
    flag = False
    for j in range(2,i):
        if i%j==0:
            flag=True
            break
    if flag==False:
        print(i,end=" ")