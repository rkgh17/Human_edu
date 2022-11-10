package Exam_02;

public class Human17DoubleWhile {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;

		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d x %d = %d \n", i, j, i * j);
				j++;
			}
			System.out.println("----------------------------");
			i++;
			j = 1;
		}

	}

}
