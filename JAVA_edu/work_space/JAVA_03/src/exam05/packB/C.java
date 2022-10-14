package exam05.packB;

import exam05.packA.A;

public class C {
	public static void main(String[] args) {
//		A a = new A();
		//클래스는 public이므로 접근 가능.
		//그러나 생성자는 protected이므로 접근 불가.
		//단, 상속된 클래스는 예외
//		a.field = 1;
//		a.method();
		//필드와 메서드도 상속받지 않은 클래스이므로
		//protected이므로 동일 package가 아닌 C에서는 접근 불가

	}

}
