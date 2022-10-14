package exam18;

import java.util.Arrays;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// 깊은 복제의 방법으로 원본과 다른 물리적 위치에 배열을 복사함.
		// 원본이 arr1을 변경해도 복제된 arr2, arr3, arr4는 변경 안됨
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		// 방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		// 방법 2
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		//배열 중 일부만 copy
		// 1부터 3전까지
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		
		// 방법 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// System클래스의 arraycopy 메서드 사용
		for(int i = 0; i<arr4.length ; i++)
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		
		System.out.println();
		arr1[2] = 'K';
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		

	}

}
