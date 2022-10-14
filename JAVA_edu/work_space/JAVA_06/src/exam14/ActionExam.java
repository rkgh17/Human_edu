package exam14;

public class ActionExam {

	public static void main(String[] args) throws Exception{
		
		Class clazz = 
//				Class.forName("exam14.SendAction");
				Class.forName("exam14.ReceiveAction");
		Action action = (Action) clazz.newInstance();
		action.execute();
		
//		Action a = new ReceiveAction();
//		a.execute();
		
		
//		try {
////			Class clazz = Class.forName("exam14.SendAction");
//			Class clazz = Class.forName("exam14.ReceiveAction");
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
