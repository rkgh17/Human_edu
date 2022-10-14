package exam03;

public class Car extends Vehicle{
	int oil;
	public Car() {
//		super();	//생략가능
		System.out.println("Car() 생성");
	}
	public Car(int oil) {
//		super();
		super(45);
		this.oil = oil;
		System.out.printf("Car(%d) 생성 \n",this.oil);
	}
	public Car(int oil, int speed) {
//		super();
		super(speed);
		this.oil = oil;
		System.out.printf("Car(%d, %d) 생성 \n",this.oil, speed);
	}
}
