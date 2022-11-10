package Exam_06_2;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int compPrice = 200;
		int audioPrice = 50;
		Buyer buyer1 = new Buyer(1000);
		
		Tv tv = new Tv(tvPrice, "TV");
		Computer comp = new Computer(compPrice, "COMPUTER");
		Audio audio = new Audio(audioPrice, "AUDIO");

		buyer1.buy(tv);
		buyer1.buy(comp);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(comp);
		buyer1.buy(comp);
		buyer1.buy(comp);
		buyer1.summary();

	}

}
