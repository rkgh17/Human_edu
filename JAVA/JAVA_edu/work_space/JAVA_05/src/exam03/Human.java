package exam03;

public class Human {

	public static void main(String[] args) {
		
		// NullPointException 예외처리
		try {
			Human human1 = new Human();
			human1.run();
			human1 = null;
			human1.run(); // 오류발생
			
			//예외발생시 catch문으로 이동하여 실행하기 때문에 catch문이 없으면 아래 두행은 실행x
			Human human2 = new Human();
			human2.run();
		}
		
		catch(NullPointerException e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println(e);
			//예외정보 얻기
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//Runtime과 NullPointer는 Exception 하위레벨이므로 둘다 동일
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("예외가 발생했습니다.");
//			
//		}
//		catch(RuntimeException e) {
//			System.out.println(e);
//			System.out.println("예외가 발생했습니다.");
//		}
		
		//오류
//		catch(NumberFormatException e) {
//			System.out.println(e);
//			System.out.println("예외가 발생했습니다.");
		
		finally {
			System.out.println("Finally를 실행합니다.");
		}
		
		System.out.println("시스템을 종료합니다.");
			
}

	private void run() {
		System.out.println("사람이 달리다");
		
	}

}
