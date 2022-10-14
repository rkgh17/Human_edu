package Exam_02;

public class ExamPrint {

	public static void main(String[] args) {
		System.out.println("HI");
		System.out.print("Hi \n");
		System.out.print("I'M H");
		System.out.print("wang.");
		System.out.println("");
		
		
		System.out.println("안녕하세요. 저희반은 " + "8" + "입니다");
		
		int studentCnt = 8;
		System.out.printf("안녕하세요. 저희반은 %d입니다\n", 8);
		System.out.printf("안녕하세요. 저희반은 %d%%입니다\n", studentCnt); // %를 따로 표현
		System.out.printf("안녕하세요. 저희반은 %3d입니다\n", studentCnt); // 3자리 정수
		
		double Temp = 32.3;
		int Humi = 63;
		System.out.printf("현재의 온도는 %.2f 입니다.\n",Temp); // (정수부).(실수부)
		System.out.printf("현재의 온도는 %.2f 이고, 습도는 %d%%입니다.\n", Temp, Humi);
		
		boolean isMan = true;
		System.out.printf("Am i man? %b \n", isMan); // %d=정수, %f=실수, %b는 불린
		
		

	}

}
