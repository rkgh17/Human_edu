import numpy as np
#슬라이싱
a = np.array([1,2,3,4,5])
print(a)
print('\n')
print(a[3:]) # 인덱스 3부터 끝까지
print('\n')
print(a[1:-1]) # 인덱스 1부터 인덱스 -1까지
print('\n')
print(a[0:3:2]) # 인데스 0부터 인덱스 3까지 간격2

a = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(a)
print('\n')
print(a[:,1:]) # 모든행 / 각 열의 인덱스 1부터 끝까지
print('\n')
print(a[0:1,0:2]) # 첫행 / 인덱스 0부터 인덱스 2까지

a = np.array([[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15]])
print(a)
print('\n')
print(a[::2,::2]) # 모든 행을 2간격만큼 / 모든 열을 2간격만큼