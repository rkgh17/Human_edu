package Exam_04;

public class Human01 {

	public static void main(String[] args) {
		String human1;
		human1 = "휴면교육센터";
		
		String human2 = "휴면교육센터";
		String human3 = new String("휴면교육센터");
		String human4 = new String("휴면교육센터");
		
		boolean x1 = (human1 == human2);
		boolean x2 = (human1 == human3);
		boolean x3 = (human3 == human4);
		
		System.out.printf("human1 == human2 : %b \n", x1);
		System.out.printf("human1 == human3 : %b \n", x2);
		System.out.printf("human3 == human4 : %b \n", x3);
	}

}
