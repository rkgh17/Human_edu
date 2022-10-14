package Exam_03;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int a=0, b=0, c=0, x=0;
		
		while(run) {
			System.out.println("\n----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");			
			a = sc.nextInt();
			
			if(a==1) {
				System.out.print("예금액> ");
				x = sc.nextInt();
				if(x<0) {
					System.out.println("올바르지 않은 값입니다. 다시 입력해 주십시오.");
					x = 0;
				}
				else {
					b+=x;
					x=0;
				}
			}
			
			else if(a==2) {
				System.out.print("출금액> ");
				c = sc.nextInt();
				if(c<0) {
					System.out.println("올바르지 않은 값입니다. 다시 입력해 주십시오.");
				}
				else if(b - c <0) {
					System.out.println("잔고가 부족합니다.");
				}
				else {
					b = b - c;
					c = 0;
				}
			}
			
			else if(a==3) {
				System.out.printf("잔고>%d\n", b);
			}
			
			else if(a==4) {
				System.out.println("\n프로그램 종료");
				break;
			}
			
			else
				System.out.println("올바르지 않은 값입니다. 다시 입력해 주십시오.");
			
		}
	}

}
