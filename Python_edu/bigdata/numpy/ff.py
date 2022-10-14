import numpy as np

#배열곱 행렬곱
a = np.array([[1,2],[3,4]])
b = np.array([[1,3],[2,4]])

print(a*b)

ma=np.mat(a)
mb=np.mat(b)
print('-'*30)
print(ma*mb)

#병합
a = np.array([[1, 2], [3, 4]])
b = np.array([[5, 6], [7, 8]])
c = np.hstack([a, b]) # 가로병합
d = np.vstack([a, b]) # 세로병합

print(a)
print(b)
print("--------")
print(c)
print(d)