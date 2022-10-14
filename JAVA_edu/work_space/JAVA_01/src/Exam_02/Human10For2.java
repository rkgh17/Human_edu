package Exam_02;

public class Human10For2 {

	public static void main(String[] args) {

		int sum = 0;

		for (int j = 0; j < 2; j++) {
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
		}

		System.out.printf("%d", sum);
	}
}