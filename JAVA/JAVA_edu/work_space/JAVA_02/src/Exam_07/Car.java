package Exam_07;

public class Car {
	
	//필드_맴버변수
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	//생성자
	public Car() {
//		this.company = "BMW";
//		this.model = "BMW500";
//		this.maxSpeed = 350;
//		this.currentSpeed = 100;
		this("BMW", "BMW500", 350, 100);
		//생성자 내의 this는 오버로딩된 생성자 중 인자의 갯수 및 타입이 통일된다.
	}
	
	//생성자 오버로딩
	public Car (String company, String model, int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	


}
