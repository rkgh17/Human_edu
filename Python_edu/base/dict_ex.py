# 학생이름, 수학성적을 입력받아 student라는 리스트에 추가하는 프로그램
# 학생이름이 빈 문자열로 들어오면 프로그램 종료.
# 마지막엔 모두 출력
f=open('d:/AI_Class/Python/file/student.txt','a')
Student =[]
while True:
    name=input('이름을 입력하시오 : ')
    if name=='':
        break
    math=int(input('수학 성적을 입력하시오 : '))
    f.write(name+', '+str(math)+'\n')
    std = {'name':name,'math':math}
    Student.append(std)
print()

i=0
while i<len(Student):
    print(f'{Student[i]}')
    i+=1
print()

for std in Student:
    print(std['name'], std['math'])
f.close()
