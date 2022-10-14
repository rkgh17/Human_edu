# 연산자
# 산술 : +, -, *, /, **, %, //, =, +=, -=, /=, %=, //= (++, --는 없음)
#        + : 양쪽이 문자열이면 연결
# 비교 : ==, !=, >=, <=, <, >, is None, is Not None
# 논리 : and, or, not
# NULL이없고 None 
# 파이썬의 키워드(keyword)는 소문자로만 쓴다.
# 상수:None, True, False는 대문자로만

# print() : format(), %
i=3.14
name='황지훈'
print(i)
print(name)

a=None
if a!=None:print(10)
else:print(-10)

a=10
b=10
print(a)
# print('사과값은'+a'원입니다') 
type(a)
print('사과값은'+str(a)+'원입니다')
print('사과값은 {}원 입니다.'.format(a))
print('사과값은 %d이고, 포도값은 %d입니다.'%(a,b))
print('사과값은 %f이고, 포도값은 %d입니다.'%(a,b))
print('사과값은 %s이고, 포도값은 %d입니다.'%(a,b))
print('사과값은 %c이고, 포도값은 %d입니다.\n'%(a,b)) #a의10을 아스키코드값으로 해석

print(f'사과값은 {a}이고, 포도값은 {b}입니다.\n') #제일 많이 씀
print(f'사과값은 {a}이고, 포도값은 {a*b}입니다.\n')

print('사과값은 [%5d]이고, 포도값은 [%5d]입니다.'%(a,b))
print('[%5s]이고, [%5s]입니다.'%('Hello','World'))
print('[%7s]이고, [%7s]입니다.\n'%('Hello','World'))

print('현재 기온은 %f도 입니다.'%28)
print('현재 기온은 [%4.1f]도 입니다.'%28)
print('현재 기온은 [%5.2f]도 입니다.'%28)
print('현재 기온은 [%10.2f]도 입니다.'%28)