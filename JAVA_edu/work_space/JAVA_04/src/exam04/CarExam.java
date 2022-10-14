package exam04;

public class CarExam {

	public static void main(String[] args) {
		Car mycar1 = new Car();
		mycar1.run();
		System.out.println("------------------");
		mycar1.rearLeftTire = new HTire();
		mycar1.run();

	}

}
