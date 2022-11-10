package exam12;

public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("Notebook display.");
	}
	
	@Override
	public abstract void typing();

}
