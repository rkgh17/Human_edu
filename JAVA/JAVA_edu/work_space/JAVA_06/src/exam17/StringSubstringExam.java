package exam17;

public class StringSubstringExam {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		// 0~6전까지 문자열 자르기
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		// 7부터 끝까지
		System.out.println(secondNum);

	}

}
