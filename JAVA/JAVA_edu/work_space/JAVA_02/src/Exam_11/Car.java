package Exam_11;

public class Car {
	static int maxSpeed;
	int currentSpeed;
	
	public void speedUP() {
		this.currentSpeed = this.currentSpeed + 1;
		this.maxSpeed = this.maxSpeed + 1; // 정적 필드는 클래스명으로 접근하는 것을 권장하나, 객체로도 접근 가능하다.
		System.out.println(this.maxSpeed);
		System.out.println(Car.maxSpeed);
	}
	
	static {
		maxSpeed = 300;
//		currentSpeed = 100; // error : 인스턴스필드는 객체 대상으로 초기화 되어야 하기 때문
//		speedUP(); // error : static 블럭 내에서는 인스턴스 메서드 호출 불가.
		// static 블럭 내에서 인스턴스 필드 및 메서드가 에러인 이유는
		// static이란것은 클래스 로드시 우선 수행되는데, 이 시점에는 아직 객체가 생성되지 않았기 때문이다.
		// 객체 생성은 new로 생성되는데, 이 부분은 static블럭 뒤에 수행됨.
	}
	
	static void driving() {
//		this.speedUP(); // error : 정적메서드 내에서는 일반매서드 호출이 부가능 -> 아래처럼 new로 객체 생성 후 접근 가능
		Car car1 = new Car();
		car1.speedUP();
		maxSpeed = 250;
	}

}
