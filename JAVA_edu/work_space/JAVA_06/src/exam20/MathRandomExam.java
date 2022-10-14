package exam20;

public class MathRandomExam {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6)+1;
		// 0 =< Math.random() < 1 --> 실수
		// 0 =< Math.random() * 6 < 6 -> 실수
		// 1 =< Math.random() * 6 + 1 < 7 -> 실수
		// (int) (6.2) -> 6
		// int캐스팅은 소수점 버림
		
		
		
		System.out.println("주사위 눈: " + num);

	}

}
