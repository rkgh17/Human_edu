package exam07;

public class ImplementC implements InterfaceC{

	@Override
	public void methodB() {
		System.out.println("ImplementC가 methodB를 호출함.");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementC가 methodC를 호출함.");
		
	}
	
	@Override
	public void methodA() {
		System.out.println("ImplementC가 methodA를 호출함.");
	}

}
