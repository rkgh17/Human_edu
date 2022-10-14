package exam_21.exam0;

public class GetMax0 {

	public static void main(String[] args) {
		int [] array1 = {5,4,9,10,3,7};
		int max1 = 0;
		int max2 = 0;
		
		for (int i = 0 ; i <array1.length ; i++) {
			if(max1 < array1[i]) {
				max1 = array1[i];
			}
		}
		System.out.printf("Max : %d \n", max1);
		
		int [] array2 = {5,4,9,10,3,11};
		for (int i = 0 ; i <array2.length ; i++) {
			if(max2 < array2[i]) {
				max2 = array2[i];
			}
		}
		System.out.printf("Max : %d \n", max2);

	}

}
