package Exam_03;

public class practice6 {
	public static void main(String[] args) {
		
		// 문자열로
		/*String a = "*";
		
		for(int i = 1 ; i<6 ; i++) {
			System.out.printf("%s\n",a);
			a += "*";
		}*/
		
		
		//2중for문
		for(int i = 1 ; i<6 ; i++) {
			for (int j = 1 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
