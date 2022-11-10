package another;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("학과를 입력하세요 : ");
		String major = s1.next();
		System.out.print("학번을 입력하세요 : ");
		int stdNo = s1.nextInt();
		
		Student std1 = new Student();
		std1.setMajor(major);
		std1.setStdNo(stdNo);

		
		System.out.printf("학과 : %s\n",std1.getMajor());
		System.out.printf("학번 : %d\n",std1.getStdNo());

	}

}
