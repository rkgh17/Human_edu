package exam05;

public class CarExam {

	public static void main(String[] args) {
		Car mycar1 = new Car();
		mycar1.run();
		System.out.println("------------------");
		mycar1.tires[0] = new HTire();
		mycar1.run();

	}
	

}
