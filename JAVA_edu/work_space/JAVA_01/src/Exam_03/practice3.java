package Exam_03;

public class practice3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=3 ; i<100 ; i++) {
			if(i%3 == 0)
				sum+=i;
		}
		System.out.printf("1부터 100까지 3의 배수의 합은 %d 입니다.", sum);
	}

}
