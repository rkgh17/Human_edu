package exam12;

public class SystemTimeExam {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 0; i<=1000000; i++)
			sum+=i;
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("sum: " + sum);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println("총 걸린 시간: " + (time2 - time1));
		
	}

}
