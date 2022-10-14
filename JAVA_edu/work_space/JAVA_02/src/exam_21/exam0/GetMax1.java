package exam_21.exam0;

public class GetMax1 {

	public static void main(String[] args) {
		int [] array1 = {5,4,9,10,3,7};
		int getMax = getMax(array1);
		
		System.out.printf("Max : %d \n", getMax);
		
		int [] array2 = {5,4,9,10,3,11};
		getMax = getMax(array2);
		
		System.out.printf("Max : %d \n", getMax);

	}

	private static int getMax(int[] array) {
		int max = 0;
		for (int i = 0 ; i <array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
