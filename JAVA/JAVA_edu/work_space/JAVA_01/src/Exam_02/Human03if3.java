package Exam_02;

import java.util.Scanner;

public class Human03if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score;
		System.out.print("점수를 입력 : ");
		score = sc.nextInt();

		if (score >= 90)
			System.out.println("당신의 점수는 A학점입니다.");
		else if (score >= 80)
			System.out.println("당신의 점수는 B학점입니다.");
		else if (score >= 70)
			System.out.println("당신의 점수는 C학점입니다.");
		else if (score >= 60)
			System.out.println("당신의 점수는 D학점입니다.");
		else
			System.out.println("당신의 점수는 F학점입니다.");

	}

}
