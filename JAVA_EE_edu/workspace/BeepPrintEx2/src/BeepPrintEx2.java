
public class BeepPrintEx2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); // 구현클래스의 새 인스턴스를 만듬
		Thread thread = new Thread(beepTask); // 인스턴스를 Thread 클래스에 넣어준다
		thread.start(); // start()호출 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}

}
