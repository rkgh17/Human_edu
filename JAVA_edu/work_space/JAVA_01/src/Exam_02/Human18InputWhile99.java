package Exam_02;

import java.util.Scanner;

public class Human18InputWhile99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i ;
		System.out.print("숫자를 입력하시오 : ");
		i = sc.nextInt();
		int j = 1;

		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d x %d = %d \n", i, j, i * j);
				j++;
			}
			System.out.println("----------------------------");
			i++;
			j = 1;
		}

	}

}
