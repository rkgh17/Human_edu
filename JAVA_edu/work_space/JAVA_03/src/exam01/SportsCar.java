package exam01;
//자식객체
public class SportsCar extends Car{
	
	public SportsCar(int currentSpeed) {
		super(currentSpeed);//부모 클래스의 생성자 호출
		this.currentSpeed = currentSpeed;
	}
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
	}
}
