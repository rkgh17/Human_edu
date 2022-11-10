package Exam_04;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int [] array = {1,5,3,8,2};
		
		for (int i = 0 ; i < array.length ; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			System.out.printf("max[0~%d] : %d\n", i, max);
		}
		
		System.out.printf("max : %d", max);

	}

}
