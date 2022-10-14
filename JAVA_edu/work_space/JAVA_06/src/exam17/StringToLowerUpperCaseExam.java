package exam17;

public class StringToLowerUpperCaseExam {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		//대소문자 차이에 의해 false
		
		String lowerStr1 = str1.toLowerCase();
		String upperStr1 = str1.toUpperCase();
		String lowerStr2 = str2.toLowerCase();
		String upperStr2 = str2.toUpperCase();
		
		System.out.printf("lower Str1 : %s\nupper Str1 : %s\n",lowerStr1,upperStr1); 
		System.out.printf("lower Str2 : %s\nupper Str2 : %s\n",lowerStr2,upperStr2);
		
		System.out.println(lowerStr1.equals(lowerStr2));
		//둘 다 소문자 -> true
		System.out.println(str1.equalsIgnoreCase(str2));
		// equalsignore는 대소문자 무시 비교

	}

}
