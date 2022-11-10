package exam04;

public class Car {
	
		Tire forntLeftTire = new KTire();
		Tire frontRightTire = new KTire();
		Tire rearLeftTire = new KTire();
		Tire rearRightTire = new KTire();
		
		void run() {
			System.out.print("앞 우 : ");
			frontRightTire.roll();
			System.out.println();
			
			System.out.print("앞 좌 : ");
			forntLeftTire.roll();
			System.out.println();
			
			System.out.print("뒤 우 : ");
			rearRightTire.roll();
			System.out.println();
			
			System.out.print("뒤 좌 : ");
			rearLeftTire.roll();
			System.out.println();
		
	}

}
