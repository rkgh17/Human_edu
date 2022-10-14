package Exam_02;

import java.util.Scanner;

public class Examinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ctrl + shift + o -> import 들어감
		String name; // 문자열 참조 클래스 (char은 한 문자)
		int age;
		double Temp;
		System.out.printf("이름은 ? : \n");
		name = sc.nextLine();
		System.out.printf("나이는 ? : \n");
		age = sc.nextInt();
		System.out.printf("온도는 ? : \n");
		Temp = sc.nextFloat();

		System.out.printf("이름은 %s\n", name);
		System.out.printf("나이는 %d\n", age);
		System.out.printf("온도는 %.2f\n", Temp);

	}

}
