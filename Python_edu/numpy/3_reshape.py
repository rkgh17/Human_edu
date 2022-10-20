import numpy as np

a = np.array([[1,2,3,4],[5,6,7,8],[9,10,11,12]])
print(a)
print('\n')
print(np.shape(a)) # 3행 4열
a.shape=(6,2) # 6행 2열로 변경 - 행열의 곱이 같아야함
print('\n')
print(a)

a = np.array([[[1,2,3],[4,5,6]],[[7,8,9],[10,11,12]],[[13,14,15],[16,17,18]]]) # 3차원 배열
print(a)
print('\n')
print(np.shape(a)) # 페이지, 행, 열
print('\n')
a.shape = (2, 3, 3) # 총 길이(곱)과 같아야 함.
print(a)

#배열곱 행렬곱
a = np.array([[1,2],[3,4]])
b = np.array([[1,3],[2,4]])

print(a*b)

ma=np.mat(a)
mb=np.mat(b)
print('-'*30)
print(ma*mb)