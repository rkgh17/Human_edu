package Exam_02;

public class Human08doWhile {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		do {
			if(cnt!=0) {
			sum +=cnt;
			System.out.printf("1부터 %d까지의 합은 %d \n", cnt, sum);
			}
			cnt++;
			
		}while(cnt<=10);
	}
}
