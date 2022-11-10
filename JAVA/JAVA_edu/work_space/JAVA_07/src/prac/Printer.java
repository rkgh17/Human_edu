package prac;

public class Printer {

	void printArray(Object[] arr) {
		try {
			for(Object i : arr) {
				System.out.println((String)i);
			}
			return;
		}catch(Exception e) {
			for(Object i : arr) {
				System.out.println((Integer)i);
			}
		}
	}
}
