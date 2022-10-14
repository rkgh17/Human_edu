package exam03;

public class ProductExam {

	public static void main(String[] args) {
		
		Product<Tv, String> prod1 = new Product<Tv, String>();
		Tv t = new Tv("SAMSUNG");
		prod1.setType(t);
		prod1.setModel("Smart Tv");
		Tv tv1 = prod1.getType();
		String str1 = prod1.getModel();
		System.out.println(tv1 + " - " + tv1.company + " / " + prod1.getModel());
		
		Product<Car, String> prod2 = new Product<Car, String>();
		Car c1 = new Car("Hyundai");
		prod2.setType(c1);
		prod2.setModel("Sports Car");
		Car car1 = prod2.getType();
		String str2 = prod2.getModel();
		
		System.out.println(car1 + " - " + car1.company + " / " + str2);
		

	}

}
