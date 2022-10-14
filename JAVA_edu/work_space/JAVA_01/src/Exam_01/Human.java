package Exam_01;

public class Human {

	public static void main(String[] args) {
		int calc = 3+4;
		System.out.println ("결과 = " + calc);
		
		int Human, human;
		Human = 10;
		human = 20;
		
		System.out.println("Human = " + Human);
		System.out.println("human = " + human);
		
		int kor = 100;
		int eng = 100;
		int sum;
		int avg;
		sum = kor+eng;
		avg = sum/2;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		System.out.println("-------------------------------");
		
		char human1 = 'A';
		char human2 = 65;
		
		System.out.println(human1);
		System.out.println(human2);
		System.out.println((int)human2);
		System.out.println("-------------------------------");
		
		long human3 = 20;
		long human4 = 10000000000L; // 8byte가 넘는 값은 L을 붙힘
		System.out.println("human3 = " + human3);
		System.out.println("human4 = " + human4);
		
		double human5 = 3.14159;
		System.out.println("human5 = " + human5);
		int human6 = (int)3.14159; // 형변환
		System.out.println("human6 = " + human6);
		float human7 = 3.14159f; // float은 f(or F)를 붙임
		System.out.println("human7 = " + human7);
		
		boolean human8 = true; // false도 가능
		System.out.println("human8 = " + human8);
		System.out.println("-------------------------------");
		
		// 1. 묵시적 형변환 = (메모리가) 큰 변수에 작은 변수를 대입
		byte human11 = 10; // 1byte
		int human12 = human11; // 4byte
		System.out.println("human12 = " + human12);
		
		/* 1. (예외) 대응하기 어려운 형태
		byte human13 = -10;
		char human14 = human13;  char에는 음수가 대입될 수 없음*/
		
		// 2. 명세적 형변환 = 작은 변수에 큰 변수를 대입
		// 형변환을 위한 처리가 필요함 ex_ (int), (byte)
		int human21 = 129;
		byte human22 = (byte)human21;
		System.out.println("human22 = " + human22);
		System.out.println("-------------------------------");
		
		int human31 = 1;
		human31+=1; //2
		human31+=1; //3
		human31 = human31 + 1 ; //4
		human31 = human31 - 1 ; //3
		human31-=1; //2
		human31-=1; //1
		human31++; //2
		human31++; //3
		human31--; //2
		human31--; //1
		System.out.println("human31="+human31);
		System.out.println("-------------------------------");
		
		int human23 = 7%3;
		double human24 = 7./3; // 둘중 하나가 실수여야함.
		System.out.println("7/3 = "+human24);
		System.out.println("7/3 몫 : " + (int)human24);
		System.out.println("7/3 나머지" + human23);
		System.out.println("-------------------------------");
		
		boolean human51 = 10 > 11;
		System.out.println("human51 = " + human51);
		boolean human52 = 10 >= 10 ;
		System.out.println("human52 = " + human52);
		boolean human53 = 10 != 10 ;
		System.out.println("human53 = " + human53);
		boolean human54 = 10 == 10 ;
		System.out.println("human54 = " + human54);
		System.out.println("-------------------------------");		
		
		int human43 = 99;
		int result = ++human43 * 10; // 증감 후 계산
		System.out.println("human43 = " + human43);
		System.out.println("result = " + result);
		
		int human44 = 99;
		int result2 = human43++ * 10; // 99로 계산 후 증감
		System.out.println("human44 = " + human44);
		System.out.println("result2 = " + result2);
		System.out.println("-------------------------------");	
		
		boolean human61 = (10 < 11) && (9 < 11); // true && true
		System.out.println("human61 = " + human61);
		boolean human62 = (10==9) || (10==10); // false || : true 하나라도 참이면 참
		System.out.println("human62 = " + human62);
		boolean human63 = (10<11) ^ (9<11); // true ^ true : 둘이 같으면 false 다르면 true
		System.out.println("human63 = " + human63);
		System.out.println("-------------------------------");	
		
		// 문자열 연산자 : 문자열끼리 연결함
		String human71 = "황";
		String human72 = "지";
		String human73 = human71 + human72 + "훈";
		System.out.println("human73 = " + human73);
		
		int v1=10;
		int v2= ~v1;
		int v3 = ~v1 + 1 ;
		System.out.println(toBinaryString(v1) + "(십진수 : "+v1+")");
		System.out.println(toBinaryString(v2) + "(십진수 : "+v2+")");
		System.out.println(toBinaryString(v3) + "(십진수 : "+v3+")");
		System.out.println("-------------------------------");
		int v4=-10;
		int v5= ~v4;
		int v6 = ~v4 + 1 ;
		System.out.println(toBinaryString(v4) + "(십진수 : "+v4+")");
		System.out.println(toBinaryString(v5) + "(십진수 : "+v5+")");
		System.out.println(toBinaryString(v6) + "(십진수 : "+v6+")");
		
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
	
}
