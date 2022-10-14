package Exam_01;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(); //Student 클래스의 생성자를 만듬
		System.out.println ("s1 : " + s1); // s1객체가 가지고 있는 주소
		System.out.println ("s1.name : " + s1.name);
		System.out.println ("s1.age : " + s1.age);
		
		Student s2 = new Student();
		System.out.println ("s2 : " + s2);
		System.out.println ("s2.name : " + s2.name);
		System.out.println ("s2.age : " + s2.age);
		
	}

}
