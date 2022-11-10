package Exam_02;

import java.util.Scanner;

public class Human02if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 점수는 ? : ");
		float kor;
		kor = sc.nextFloat();
		
		System.out.printf("당신의 국어 점수는 %.2f입니다.\n", kor);
		
		if (kor>=60) {
			System.out.println("합격입니다.");
		}
//		if (kor<60) {
//			System.out.println("불합격입니다.");
//		}
		else {
			System.out.println("불합격입니다.");
		}

		System.out.println("프로그램을 종료합니다.");
	}

}