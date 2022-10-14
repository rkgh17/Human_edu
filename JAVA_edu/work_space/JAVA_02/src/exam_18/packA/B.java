package exam_18.packA;

public class B {

	public static void main(String [] args) {
		A a1 = new A(true); // public : 동일 package
//		A a2 = new A(10); 
		// a2생성자 : 같은 package여도 private라 생성x
		// private는 동일 클래스에서만 접근 가능
		A a3 = new A(1.1,1); 
		// default인경우 동일 package에서 접근 가능

		}
}
