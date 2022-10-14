package Exam_03;

public class practice5 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<11 ; i++) {
			for(int j = 1 ; j<11 ; j++) {
				if(4 * i + 5 * j == 60) {
					System.out.printf("4x + 5y = 60 의 해 = (%d, %d)\n", i, j);
				}
			}
		}
	}

}
