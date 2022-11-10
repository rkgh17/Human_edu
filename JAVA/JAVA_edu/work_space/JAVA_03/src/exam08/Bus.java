package exam08;

public class Bus extends Car{
	public Bus() {
		System.out.println("Bus 객체 생성");
	}
	public int getCharge() {
		int money = 1450;
		System.out.printf ("버스의 교통요금 : %d \n",money);
		return money;
	}

}
