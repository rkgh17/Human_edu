package Exam_02;

import java.util.Scanner;

public class Human11Gugudan {
	public static void main(String[] args) {

		int dan;
		
//		int dan = 5;
//		
//		for (int cnt = 1; cnt <10 ; cnt++) {
//			System.out.printf("%d X %d = %d \n", dan, cnt, dan * cnt );
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 단을 입력하세요 :  ");
		dan = sc.nextInt();
		
		
		for (int cnt = 1; cnt <10 ; cnt++) {
			System.out.printf("%d X %d = %d \n", dan, cnt, dan * cnt );
		}
		
	}
	

}
