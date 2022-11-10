package exam17;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		// append = 문자열 뒤에 추가
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		// insert = 문자 추가
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		// setCharat = 문자 교체
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		// replace = 문자열 교체
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		// delete = 삭제
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
