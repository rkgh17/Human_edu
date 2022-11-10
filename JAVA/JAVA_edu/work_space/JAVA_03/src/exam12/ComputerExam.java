package exam12;

public class ComputerExam {

	public static void main(String[] args) {
		DeskTop dt1 = new DeskTop();
		MyNoteBook mnb1 = new MyNoteBook();
		
		dt1.turnOn();
		dt1.display();
		dt1.typing();
		dt1.turnOff();
		
		System.out.println("---------------");
		
		mnb1.turnOn();
		mnb1.display();
		mnb1.typing();
		mnb1.turnOff();
	}

}
