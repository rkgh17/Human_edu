package exercise7;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		
		snowTire.run();
		
		
		SnowTire tire = (SnowTire) new Tire();
		tire.run();
		// 생성자를 통해 생성하지 않았음
		
		

	}

}
