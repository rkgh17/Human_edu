package Exam_03;

import java.util.Scanner;

public class practice7_switch {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");			
			
			switch (sc.next()) {
			case "1" :
				System.out.print("예금액 : ");
				balance += sc.nextInt();
				break;
			case "2" :
				System.out.print("출금액 : ");
				balance -= sc.nextInt();
				break;
			case "3" :
				System.out.printf("잔고>%d", balance);
				break;
			case "4" :
				System.out.print ("프로그램 종료");
				run = false;
				break;
			
			}
			
		}
		
	}
}
