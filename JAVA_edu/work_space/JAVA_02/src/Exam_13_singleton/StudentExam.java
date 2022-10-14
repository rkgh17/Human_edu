package Exam_13_singleton;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = Student.getInstance();  // Student클래스에서 생성된 s가 반환됨.
		Student s2 = Student.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
//		Student s3 = new Student(); // Student의 생성자가 private기 때문에 error
	}

}
