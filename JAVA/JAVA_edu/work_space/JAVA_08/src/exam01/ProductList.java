package exam01;

public class ProductList {

	public static void main(String[] args) {
		Product[] prod = new Product[10];
		
		prod[0] = new Product("TV");
		prod[1] = new Product("HandSet");
		prod[2] = new Product("CAR");
		
//		prod[1] = null; // 폰 분실
		
		for(int i = 0;  i<prod.length ; i++) {
			try {
				System.out.printf("%s ",prod[i].name);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}

	}

}
