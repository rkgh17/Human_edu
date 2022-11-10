package exam06_01;

public class DriveExam {

	public static void main(String[] args) {
		Bus b = new Bus();
		Driver driver = new Driver();
		
		driver.drive(b);
		// Vehicle v = b;
		// 자동타입변환
		// 실제 구현 클래스의 내용을 인터페이스의 구현객체로 타입변환 가능
		// VEhicle v = new Bus();
		Taxi t = new Taxi();
		driver.drive(t);
		
	}

}
