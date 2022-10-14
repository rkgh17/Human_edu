package Exam_02;

public class Human06Switch {

	public static void main(String[] args) {
		//고객의 등급에 따라 고객 등급을 표현함.
		char grade = 'B';
		
		switch (grade) {
		
		case 'A' :
			System.out.println("당신은 A등급입니다.");
			break;
		case 'B' :
			System.out.println("당신은 B등급입니다.");
			break;
		case 'C' :
			System.out.println("당신은 C등급입니다.");
			break;
		default :
			System.out.println("당신은 회원이 아닙니다.");
			break;
		}
	}

}
