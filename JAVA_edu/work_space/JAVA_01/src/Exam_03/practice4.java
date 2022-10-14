package Exam_03;

public class practice4 {

	public static void main(String[] args) {

		while (true) {
			int dice1 = ((int) (Math.random() * 10) % 6) + 1; // Math.random()*6 +1
			int dice2 = ((int) (Math.random() * 10) % 6) + 1;
			System.out.printf("주사위가 %d, %d가 나왔습니다! \n", dice1, dice2);
			
			if (dice1 + dice2 == 5 || dice1 + dice2 == 10) {
				break;
			}
		}

	}

}
