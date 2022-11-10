package exam02;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number)
				return true;
		}
		return false;
	}
	
	// Object Classd의 hassCode() 메서드는 주소값 기준 생성.
	// Key클래스의 hashCode()는 멤버변수 number에 대한 값.
	// number가 같은 객체이면 같은 것으로 인식.
	// 따라서 아래코드를 오버라이딩 함으로써
	// k1과 k2는 같은 것
	public int hashCode() {
		return number;
	}

}
