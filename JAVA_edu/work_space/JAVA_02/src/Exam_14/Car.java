package Exam_14;

public class Car {
	final String company = "현대";
	final String carId; //차대번호
	String model;
	
	public Car(String carId, String model) {
		this.carId = carId; // final로 지정된 멤버변수는 한번은 초기화 가능
		this.model = model;
	}
	
	public void setCompany(String company) {
//		this.company = company; 
	}
	
}
