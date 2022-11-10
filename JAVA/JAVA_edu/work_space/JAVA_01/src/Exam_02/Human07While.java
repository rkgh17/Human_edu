package Exam_02;

public class Human07While {

	public static void main(String[] args) {
		// 1~10까지 반복하면서 총 합을 구하는 프로그램.

		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			System.out.printf("1부터 %d까지 누적합은 %d \n", i, sum);
			i++;
			}
	}

}