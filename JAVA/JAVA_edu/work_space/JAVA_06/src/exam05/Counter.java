package exam05;

public class Counter {
	public int no;
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번째의 객체의 finalize 실행");
	}

}
