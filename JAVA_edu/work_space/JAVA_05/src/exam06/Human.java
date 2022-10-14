package exam06;

public class Human {

	public static void main(String[] args) {
		
		try {
			Human human1 = new Human();
			human1.run();
			// case1 : NullPointException
			human1 = null;
//			human1.run();
			Human human2 = new Human();
			human2.run();
			
			// case2 : NumberFormatException
			// 발생한 예외에 대해서 처리를 하지 않는다면. (NumberFormat 예외에 대한 소스 주석처리함)
			// Finally를 수행한 후에 시스템 강제종료
			String str = "a100";
			int intStr = Integer.parseInt(str);
			System.out.println("intStr : " + intStr);
		}
		
		catch(NullPointerException ne) {
			System.out.println("NullPointer 예외가 발생했습니다.");
//			System.out.println(ne);
//			e.printStackTrace();
			System.out.println(ne.getMessage());
		}
//		catch (NumberFormatException fe) {
//			System.out.println("NumberFormat 예외가 발생했습니다.");
//			System.out.println(fe.getMessage());
//		}
		
		finally {
			System.out.println("Finally를 실행합니다.");
		}
		
		System.out.println("시스템을 종료합니다.");
			
}

	private void run() {
		System.out.println("사람이 달리다");
		
	}

}
