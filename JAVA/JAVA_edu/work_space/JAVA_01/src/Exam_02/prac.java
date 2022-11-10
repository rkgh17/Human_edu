package Exam_02;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("A를 입력하시오 : ");
		word = sc.nextLine();

		if ("A".equals(word))
			System.out.println("잘했습니다.");
		else
			System.out.println("틀렸습니다.");

	}

}