"""
파일 입출력

3mode
1. Read only
2. Write only
3. Append

f=open(화일의 위치와 이름, 'r'/'w'/'a') -> 존재하지 않으면 create
f.read()/f.readLine()
f.write()/f.writeLine()
f.close()
"""
student=[]
print('-'*80)
f=open('d:/AI_Class/Python/file/student.txt','r')
line=f.readline()
while line!='':
    ar=line.split(',')
    str={'name':ar[0], 'math':int(ar[1])}
    student.append(str)
    line=f.readline()
f.close()

for str in student:
    print(str['name'], str['math'])