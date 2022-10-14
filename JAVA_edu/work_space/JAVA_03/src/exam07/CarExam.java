package exam07;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		car1.run();
		System.out.println("-------------------");
		//경차 구입
		Car car2 = new MicroCar();
		car2.run();
		System.out.println("-------------------");
		//택시탐
		Car car3 = new Taxi();
		car3.run();
	}

}
