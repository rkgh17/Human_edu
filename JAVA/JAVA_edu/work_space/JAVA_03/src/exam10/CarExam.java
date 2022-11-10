package exam10;

public class CarExam {

	public static void main(String[] args) {
		// Car car1 = new Car();
		// 추상클래스의 생성자는 호출 불가능
		SportsCar sCar1 = new SportsCar();
		sCar1.driving();
		int speed = sCar1.speedUp();
		int charge = sCar1.getCharge();
		
		System.out.println(""+speed +" "+ charge);
		
		sCar1.stop();
	}

}
