package Exam_02;

public class Method {

	public static void main(String[] args) {
		printTEST();
		printTEST("황지훈");
		printTEST("황지훈", 27);
		
		int x1;
		x1 = add(10, 20);
		System.out.printf("x1 : %d \n", x1);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void printTEST() {
		System.out.println("HI");
	}
	
	private static void printTEST(String string) {
		System.out.printf("My name is %s\n", string);
	}
	
	private static void printTEST(String string, int i) {
		System.out.printf("My name is %s.\nI'm %d years old\n", string, i);
	}
	
	private static int add(int i, int j) {
		System.out.printf("i : %d \n", i);
		System.out.printf("j : %d \n", j);
		int z = i + j;
		return z;
	}

}
