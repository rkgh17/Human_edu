package Exam_04;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d \n", i, scores[i]);
				}
			} else if (selectNo == 4) {
				int max = -1000;
				int sum = 0;
				double cnt = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
					cnt++;
				}
				avg = sum / cnt;
				
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("평균 점수 : %.1f\n", avg);

			} else if (selectNo == 5) {
				run = false;
			}

		}

		
		System.out.println("프로그램 종료");
	}

}
