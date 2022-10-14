package Exam_06_1;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int compPrice = 200;
		int audioPrice = 50;
		TV tv = new TV(tvPrice, "TV");
		Computer comp = new Computer(compPrice, "COMPUTER");
		Audio audio = new Audio(audioPrice, "AUDIO");
		
		Buyer buyer = new Buyer(1000);

		
		buyer.buy(tv);
		buyer.summary();
		buyer.buy(comp);
		buyer.buy(comp);
		buyer.buy(comp);
		buyer.buy(comp);
		buyer.buy(comp);
		buyer.summary();
		buyer.buy(comp);
		buyer.summary();
		buyer.buy(tv);
		buyer.summary();


	}

}
