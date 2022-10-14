package exam05;

public class Car {
	
	Tire [] tires = {new KTire(),new KTire(),new KTire(),new KTire()};
	
	void run() {
		for(int i = 0 ; i < tires.length ; i++) {
			System.out.printf("%d : ",i+1);
			tires[i].roll();
			System.out.println();
		}
			
	}

}
