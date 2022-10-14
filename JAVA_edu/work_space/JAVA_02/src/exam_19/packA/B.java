package exam_19.packA;

public class B {
	
	public static void main(String [] args) {
		A a = new A();
		a.field1 = 11; //public이므로 외부에서 접근하여 데이터 갱신 가능
//		a.field2 = 12; //private이므로 외부에서 접근불가
		a.field3 = 13; //default이므로 같은 package의 외부에서 데이터 갱신 가능
		
		a.method1();
//		a.method2();
		a.method3();
	}

}
