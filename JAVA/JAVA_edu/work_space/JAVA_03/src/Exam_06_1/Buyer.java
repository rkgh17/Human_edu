package Exam_06_1;

public class Buyer {
	int money;
	Product [] cart = new Product[10];
	int index = 0;
	
	public Buyer(int money) {
		this.money = money;		
	}
	
	public void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("잔고가 부족합니다.");
			return;
		}

		this.money = money - p.price;
		this.add(p);

	}
	
	public void add(Product p) {
		this.cart[this.index] = p;
		this.index++;		
	}
	
	public void summary() {
		System.out.print("구입한 물건의 목록 : ");
		for(int i = 0; i<this.index ; i++) {
			System.out.printf("%s  |  ",cart[i].name);
		}
		System.out.println();
		System.out.printf("사용 금액 : %d\n남은 금액 : %d\n",1000-this.money,this.money);
		System.out.println("-----------------------------------------------------------------------------");
	}
	
}
