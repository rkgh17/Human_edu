package exam03_2;

public class ProductExam {

	public static void main(String[] args) {
		
		Product<Tv, String> prod1 = new Product<Tv, String>();
		Tv t = new Tv("SAMSUNG","Galaxy TV", 300, true);
		prod1.setType(t);
		prod1.setModel("Smart Tv");
		Tv tv1 = prod1.getType();
		System.out.println(tv1 + " - " + tv1.company + " / " + prod1.getModel());
		System.out.println(tv1.name + " / " + tv1.maxChannel + " / " + t.isVoiceRecogition);
		System.out.println("----------------------------------------------------------");
		
		Product<Car, String> prod2 = new Product<Car, String>();
		Car c1 = new Car("Hyundai","G70",300);
		Car c2 = new Car("KIA", "k7", 250);
		Car c3 = new Car("SSANYONG", "ACTYON", 160);
		prod2.setType(c1);
		prod2.setModel("Sports Car");
		Car car1 = prod2.getType();
		
		System.out.println(car1 + " - " + car1.company + " / " + prod2.getModel());
		System.out.println(car1.name+" - "+car1.maxSpeed);
		

	}

}
