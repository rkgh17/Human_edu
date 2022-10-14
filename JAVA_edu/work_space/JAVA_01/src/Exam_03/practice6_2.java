package Exam_03;

public class practice6_2 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > 1; j--) {
				if (j - i < 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
