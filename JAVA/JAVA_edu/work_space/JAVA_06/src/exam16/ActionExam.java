package exam16;

public class ActionExam {

	public static void main(String[] args) throws Exception{
		
		
		
//		Action a = null;
//		// 기존의방법
//		a = new ReceiveAction();
//		a.execute();
//		
		//동적 객체 생성.
		String str = "exam16.ReceiveAction";
		Class clazz = Class.forName("exam16.ReceiveAction");
		Action action = (Action) clazz.newInstance();
		action.execute();
		
		
//		Class clazz = 
////				Class.forName("exam16.SendAction");
//				Class.forName("exam16.ReceiveAction");
//		Action action = (Action) clazz.newInstance();
//		action.execute();
		
//		Action a = new ReceiveAction();
//		a.execute();
		
		
//		try {
////			Class clazz = Class.forName("exam16.SendAction");
//			Class clazz = Class.forName("exam16.ReceiveAction");
//			Action action = (Action) clazz.newInstance();
//			action.execute();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}

	}

}
