package Exam_02;

public class Human15OddNumber99 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i%2 == 1) {
				System.out.printf("%d x %d = %d \n", i, j, i * j);
				}
			}
			if(i%2 == 1)System.out.println("------------------------------------------");
		}
	}

}
