package exam11;

public class CarExam {

	public static void main(String[] args) {
		// Car car1 = new Car();
		// 추상클래스의 생성자는 호출 불가능
		SportsCar sCar1 = new SportsCar();
		Bus bus1 = new Bus();
		sCar1.driving();
		int speed = sCar1.speedUp();
		int charge = sCar1.getCharge();
		System.out.println(""+speed +" "+ charge);
		sCar1.stop();
		
		System.out.println();
		
		bus1.driving();
		speed = bus1.speedUp();
		charge = bus1.getCharge();
		System.out.println(""+speed +" "+ charge);
		bus1.stop();
	}

}
