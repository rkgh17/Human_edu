package exam07;

public class Taxi extends Car{
	public Taxi() {
		super();
		System.out.println("Taxi객체 생성");
	}
	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}
}
