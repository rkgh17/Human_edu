"""
접근제한자 없음 / 필드 선언 없음 / 리스트에 넣기 가능

생성자는 오직 하나

사용방법
person = Student(3,'John') -> 자바의 new 클래스명
"""
# 문법
class Student:
    def __init__(self): #생성자는 오직 하나
        pass
    def __init__(self, x, y): # 초기화 & 멤버변수 생성
        self.grade = x
        self.name = y
    def setGrade(self,x):
        self.grade = x
    def getGrade(self):
        return self.grade
    def setName(self,y):
        self.name = y
    def getName(self):
        return self.name

person = Student(3,'John')
print(f'grade [{person.getGrade()}]')
print(f'grade [{person.getName()}]')

# p1 = Student()
# p1.setGrade(4)
# p1.setName('Johanson')
# print(f'p1 grade [{person.getGrade()}]')
# print(f'p1 grade [{person.getName()}]')