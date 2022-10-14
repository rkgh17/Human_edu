package exam13;

public abstract class Animal {
	public String kind; //하위 클래스가 가리키는 종류
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
	//어떤 동물인지는 모르므로 추상 메서드 활용
}
