package exam_18.packA;

public class A {//public : 다른 package에서도 접근 가능
	public A(boolean a) {
		System.out.println("a1 생성");
	}
	private A(int i) {
		System.out.println("a2 생성");
	}
	A(double d, int i) {//default
		System.out.println("a3 생성");
	}
	
	public static void main(String [] args) {
	A a1 = new A(true); // a1생성자
	A a2 = new A(10); // a2생성자
	A a3 = new A(1.1,1); // a3생성자
	//자신의 클래스는 생성자의 접근제한자와 상관 없으 모두 접근 가능
	}
}
