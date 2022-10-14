package exam02;

public class Child extends Parent{
	public Child() {
//		super();	//인자가 없는 부모 생성자는 생략 가능.
		super(10);
		//부모 생성자 호출..
		//상속을 받은 자식클래스의 생성자는
		//super호출을 기본으로 한다.
		//super호출은 한번만 꼭 해야함
		System.out.println("Child 생성자 호출");
	}
	public Child(int i) {
//		super(i);
		System.out.println("인자가 있는 child생성자");
	}
}
