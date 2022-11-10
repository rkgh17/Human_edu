package Exam_02;

import java.util.Scanner;

public class Human05if4 {

	public static void main(String[] args) {
		// 60점 이상이면 합격. 그중 90점도 넘으면 장학생.
		Scanner sc = new Scanner(System.in);

		int score;
		System.out.print("점수를 입력 : ");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격입니다.");
			{
				if (score >= 90)
				System.out.println("당신은 장학생입니다.");
			}
		} else
			System.out.println("불합격입니다.");
	}

}