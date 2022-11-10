package exam17;

public class StringIndexExam {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		System.out.println(subject.indexOf("자바"));
		System.out.println(subject.indexOf("자바를"));
		
		if(subject.indexOf("자바") != 1)
			// subject.indexOF("자바") = 0
			// subject의 처음 시작이므로
			System.out.println("자바 관련 책");
		else
			System.out.println("자바 미관련 책");
		
		

	}

}
