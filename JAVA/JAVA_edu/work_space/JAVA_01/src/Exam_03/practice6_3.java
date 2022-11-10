package Exam_03;

public class practice6_3 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (j - i >= 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
