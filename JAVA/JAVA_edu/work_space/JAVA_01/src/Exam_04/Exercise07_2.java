package Exam_04;

public class Exercise07_2 {

	public static void main(String[] args) {
		int min = 10;
		int [] array = {1,5,3,8,2};
		
		for (int i = 0 ; i < array.length ; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			System.out.printf("min[0~%d] : %d\n", i, min);
		}
		
		System.out.printf("min : %d", min);
		
	}

}
