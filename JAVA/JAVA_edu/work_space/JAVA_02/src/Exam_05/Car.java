package Exam_05;

public class Car {
	
	//필드_맴버변수
	String company;
	String model;
	int maxSpeed;
	int currentSpeed;
	
	//생성자
	public Car() {
		this.company = "BMW";
		this.model = "BMW500";
		this.maxSpeed = 350;
		this.currentSpeed = 100;
	}
	
	public Car (String company, String model, int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
//	Car(){
//		
//	}
//	
//	Car(String model) {
//		this(model, "은색", 250);
//	}
//	
//	Car(String model, String color) {
//		this(model, color, 250);
//	}
//	
//	Car(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}

}
