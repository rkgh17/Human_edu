package exam_18.packB;

import exam_18.packA.A;

public class C {
	public static void main(String [] args) {
		A a1 = new A(true); 
		// import문을 사용하면 public 접근 가능
//		A a2 = new A(10); 
		// private 접근 불가능
		// private는 동일 클래스에서만 접근 가능
//		A a3 = new A(1.1,1); 
		// default : 동일 package에서만 접근 가능

		}

}
