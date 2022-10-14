package exam17;

public class StringSplitExam {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		// names[0] = 홍길동
		// names[1] = 이수홍
		// names[2] = 박연수
		// names[3] = 김자바
		// names[4] = 최명호
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
