package exam01;

public abstract interface RemoteControl {
	public static int MIN_VOL = 0;
	public abstract void turnOn();
	//추상메서드는 메서드를 선언상태까지만 한 것.
	//abstract는 생략 가능_컴파일 과정에서 자동으로 붙음

	// 아래는 JAVA8 버젼 이후 추가 가능
	// default 메서드는 해당 Interface를 구현하는 실체클래스 모두가 default로 사용할 수 있음
	// 실체클래스에서 오버라이드하면 실체클래스의 기능을 수행하고,
	// 실체클래스에서 구현하지 않으면 Interface에 있는 default 메서드를 수행한다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("묵음");
		}
		else {
			System.out.println("묵음해제");
		}
		

	}
	static void changeBatt() {
		//static은 클래스 차원의 내용.
		System.out.println("Please change Battery.");
	}
}
