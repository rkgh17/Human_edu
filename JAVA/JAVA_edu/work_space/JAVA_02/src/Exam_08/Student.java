package Exam_08;

public class Student {
	public int money;
	public String name;
	
	public Student (int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money = this.money - 1200;
	}
	public void takeSW(Subway subway) {
		subway.take(1450);
		this.money = this.money - 1450;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money = this.money - 10000;
	}
	
	
	
	
	public void showInfo() {
		System.out.printf("%s님의 현재 잔고는 %d입니다.\n", this.name, this.money);
	}

	public void getoffbus(Bus bus) {
		bus.getoff();
		
	}
	public void getoffSubway(Subway subway) {
		subway.getoff();
		
	}
}
