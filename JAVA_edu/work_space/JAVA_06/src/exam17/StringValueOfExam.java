package exam17;

public class StringValueOfExam {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		//int 10 -> string 10
		String str2 = String.valueOf(10.5);
		// double 10.5 -> string 10.5
		String str3 = String.valueOf(true);
		// boolean true -> string true
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(str3.getClass());
		
		Integer i1 = new Integer(10);
		String str4 = String.valueOf(i1);
		
		System.out.println(i1);
		System.out.println(i1.getClass());
		
		
		System.out.println(str3.substring(1,3));
		// true 의 ru만 나옴
		// 0123
		
	}

}
