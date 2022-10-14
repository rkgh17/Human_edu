package Exam_04;

public class Human02ScoreCalc {

	public static void main(String[] args) {
		int [] score = {100,90,80,70,60,50,40,30,20,10,10,20,30,40,50,60,70,80,90,100};
		int total = 0;		
		
		System.out.println("score : " + score);
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		System.out.println("score[10] : " + score[10]);
		System.out.println("score[19] : " + score[19]);
		//System.out.println("score[20] : " + score[20]);
		System.out.println ("score.length : " + score.length); // 총 길이
		
		for (int i = 0 ; i <score.length ; i++) {
			total += score[i];
		}
		System.out.printf("total : %d\n", total);
		System.out.printf("avg : %d\n", total / score.length);
	}

}
