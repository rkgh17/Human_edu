package Exam_13_singleton;

public class Student {
	private static Student s = new Student();
	private Student() {
	}
	
	public static Student getInstance() {
		return s;
	}
}
