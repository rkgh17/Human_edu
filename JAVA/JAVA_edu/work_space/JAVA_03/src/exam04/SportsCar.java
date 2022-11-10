package exam04;
//자식객체
public class SportsCar extends Car{
	
	public SportsCar(int currentSpeed) {
		super(currentSpeed);//부모 클래스의 생성자 호출
		this.currentSpeed = currentSpeed;
	}
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
	}
	@Override //annotation을 통해서 오류를 사전에 확인할 수 있다 
	public void speedUp() { 
		//오버라이딩
		//부모의 메서드를 자식의 입장에서 재정의
		this.currentSpeed = this.currentSpeed + 5;
	}
}
