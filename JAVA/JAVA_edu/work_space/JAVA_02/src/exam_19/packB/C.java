package exam_19.packB;

import exam_19.packA.A;

public class C {
	
	public static void main(String [] args) {
		A a = new A();
		a.field1 = 11; //public이므로 import를 통해 외부에서 접근하여 데이터 갱신 가능
//		a.field2 = 12; //private이므로 외부에서 접근불가
//		a.field3 = 13; //default이므로 다른 package에서 접근 불가
		
		a.method1();
//		a.method2();
//		a.method3();
	}

}
