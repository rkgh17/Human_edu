"""
https://076923.github.io/posts/Python-numpy-1/
-넘파이 강의
"""
import numpy as np

#numpy 배열생성
a=[1,2,3,4,5] #파이썬 리스트
b=np.array(a) #넘파이 리스트 -> ,가 없음
c=np.array([1,3,5])
print(a)
print(b)
print(c)

#넘파이 배열 복제
a=np.array([1,2,3,4,5])
b=a
c=a.copy() # 새로운 객체 생성
b[0]=99
print(a)
print(b) # 원본을 수정해도 같이 수정됨
print(c) # 새로운 객체 생성
print(b[2])
print(a[2])
print(c[-1])
print(c[0:2])

#넘파이 배열 호출
a = [1, 2, 3, 4, 5]
b = np.array(a)
c = np.array([1, 3, 5])

#넘파이 배열 계산
print(a*2) # 파이썬 리스트에 * n = n번 반복
print(b*2) # 값들을 2배씩 곱함
print(c+3) # 값마다 3씩 더함

#1차원 배열
a = np.array([1,2,3],dtype=int)
b = np.array([1.1,2.2,3.3],dtype=float)
a1 = np.array([1,2,3],dtype=float)
c = np.array([1,1,0],dtype=bool)
print(a)
print(b)
print(a1)
print(c)
#ture false
print(np.array(([-1,-3,1,0,5,7]),dtype=bool))

#다차원 배열
b = np.array([[[1,2],[3,4]],[[5,6],[7,8]],[[9,10],[11,12]]])
print(b)
print(b[0][1][1])

#배열 속성 반환
print(b.ndim) # 차원
print(b.shape) # 1차원 3개, 2차원 2개, 2차원 2개
print(b.dtype) # 64비트

#모든 값이 1인 배열_ 초기화
a = np.ones((2,2),dtype=int)
b = [1,2,3,4,5]
c = np.ones_like(b,dtype=int) # b의 크기와 동일하고 모든 원소의 값이 1인 배열

print(a)
print(b)
print(c)

#모든 값이 0인 배열
a = np.zeros((2,2),dtype=int)
b = [1,2,3,4,5]
c = np.zeros_like(b,dtype=int)

print(a)
print(b)
print(c)

# 모든 값이 비어있는 배열
a = np.empty((2,2),dtype=int)
b = [1,2,3,4,5]
c = np.empty_like(b,dtype=int)

print(a)
print(b)
print(c)

#  대각의 값이 1인 배열(단위 행렬)
a = np.identity(4,dtype=int)# 4*4의 단위행렬
b = np.eye(4,4,k=1,dtype=int)# k값만큼 이격된 단위 행렬
print(a)
print(b)

a = np.identity(20,dtype=int)
b = np.eye(7,7,k=2,dtype=int)
c = np.eye(7,7,k=-2,dtype=int)
print(a)
print('\n\n')
print(b)
print('\n\n')
print(c)

#등간격
a = np.arange(0,10,step=5)
b = np.arange(1,10,step=5)
c = np.arange(0,10,step=1)
print(a)
print(b)
print(c)

a = np.linspace(0,10,num=5,endpoint=True,retstep=True) # 0부터 10 사이의 값을 num만큼 생성하여 배열로 반환 / retstep이 true일 경우 값들의 간격을 표히새줌
b = np.linspace(1,10,num=5,endpoint=True,retstep=False) # 1부터 10까지를 5등분
c = np.linspace(0,10,num=5,endpoint=False,retstep=False) # endpoint가 ture일 경우 end의 값이 마지막이 됨
print(a)
print(b)
print(c)
#로그 배율을 사용
a = np.logspace(0,10,num=5,endpoint=True,base=10.0)
b = np.logspace(1,10,num=5,endpoint=True,base=5.0)
c = np.logspace(0,10,num=5,endpoint=False,base=1.0)
print(a)
print(b)
print(c)