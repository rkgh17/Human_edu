package Exam_09;

public class Employee {
	public int emplyeeId;
	public static int serialNum = 1000;
	
	public Employee() {
		serialNum++;
		this.emplyeeId = serialNum;
	}

}
