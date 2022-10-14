package exam_17.packA;

import exam_17.packB.D;
//import exam_17.packB.*;

class A { //default
	A a = new A();
	// 나 자신은 접근 가능
	B b = new B();
	// B는 public이므로 동일package인 a에서 접근 가능
	// public은 어디에서도 접근 가능
//	C c = new C();
	// C는 default이므로 다른 package인 a에서 접근 불가능
	D d = new D();
	// D는 public이므로 import를 통해서 접근 가능
}
