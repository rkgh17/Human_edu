# selection sort : 선택정렬
ar=[100,-2,-14,25,7,3,5,109]
for i in range(len(ar)):
    for j in range(i+1,len(ar)):
        if ar[i]>ar[j]:
            ar[j], ar[i] = ar[i], ar[j]
print(ar)

#insertion sort : 삽입정렬
ar=[100,-2,-14,25,7,3,5,109]
br=[ar.pop(0)]

for i in range(len(ar)):
    for j in range(len(br)):
        if (br[j]>ar[i]):
            br.insert(j,ar[i])
            break
        elif (i==len(ar)-1):
            br.append(ar[i])
            break

print(br)

#bubble sort : 버블정렬
ar=[100,-2,-14,25,7,3,5,109]
for j in range(len(ar)):
    for i in range(len(ar)-1):
        if ar[i]>ar[i+1]:
            ar[i],ar[i+1] = ar[i+1], ar[i]
print(ar)
