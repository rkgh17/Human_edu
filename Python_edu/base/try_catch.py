"""
문법
try:
    실행문1
    ...
    실행문n
except [Exception as e]:
    실행문
finally:
    실행문
"""

try:
    n=int(input('숫자를 입력하시오 : '))
    x=n**2
    print(x)
except Exception as e:
    print(e)
finally:
    print('program terminated.')