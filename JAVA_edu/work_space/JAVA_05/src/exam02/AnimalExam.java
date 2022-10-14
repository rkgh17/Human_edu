package exam02;

public class AnimalExam {
	public static void main(String[] args) {
		
		// case4 : ClassCatException
		Animal am = new Cat(); // 자동 타입 변환
		Cat c = (Cat) am; // 강제 타입 변환
		
//		Dog d = (Dog) am; // 강제 타입 변환
//		//(d instanceof Dog) ==> false가 나오므로 ClassCatException 발생
	}

}
