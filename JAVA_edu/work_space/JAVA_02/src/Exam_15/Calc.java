package Exam_15;

public class Calc {
	static final double PI = 3.141592;
	//static은 클래스가 로드되는 시점에 PI값을 대입.
	//PI라는 변수는 3.151692라는 상수처럼 사용 가능.
	
	double circle(double r) {
		return PI*r*r; //원의 넓이
	}

}
