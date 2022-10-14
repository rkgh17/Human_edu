package exam17;

public class StringCharAtExam {
	public static void main(String[] args) {
		String ssn = "960000-1000000";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
			System.out.println("남자");
			break;
		case '3':
			System.out.println("남자");
			break;
		case '2':
			System.out.println("여자");
			break;
		case '4':
			System.out.println("여자");
			break;
		}
	}

}
