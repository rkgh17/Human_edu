package exam01;

public class RemoteControlExam {

	public static void main(String[] args) {
//		RemoteControl rc = new Tv();
//		//앞은 인터페이스 - 뒤는 구현 클래스
//		//rc는 구현 객체라고 하고
//		//tv는 구현 클래스라고 한다.
//		rc.turnOn();
//		rc.setMute();
//		//tv에서 오버라이드하면 구현클래스의 메서드 실행됨.
		
		RemoteControl rc = new Audio();
		rc.turnOn();
		boolean mute = false;
		rc.setMute(mute);
		RemoteControl.changeBatt();

	}

}
