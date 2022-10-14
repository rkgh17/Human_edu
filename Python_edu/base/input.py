"""
JS
alert() -- 확인
confirm() -- true/false (yes/no, ok/cancel)
prompt() -- 문자열로 입력

JAVA
Scanner sc = new Scanner(System.in)
s.next~~~

Python
String input(설명/가이드)
"""
name = input('이름을 입력하시오 : ') # 무조건 str으로 들어옴
name

n = input('주문할 수량을 입력하시오 : ')
type(n)
i=int(n)
type(n)
n = int(input('주문할 수량을 입력하시오 : '))

n = input('주문할 수량을 입력하시오 : ')
if n.isnumeric():
    n=int(n)
else:
    print('숫자만 입력가능')

