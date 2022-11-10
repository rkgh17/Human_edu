package Exercise_04;

public class Delivery {
	public String receiptNumber;
	public String PhoneNum;
	public String address;
	public String receiptDate;
	public String receiptTime;
	public int price;
	public int menuNumber;
	
	public Delivery(String receiptNumber, String PhoneNum, String address, String reciptDate, String receiptTime, int price, int menuNumber) {
		this.receiptNumber = receiptNumber;
		this.PhoneNum = PhoneNum;
		this.address = address;
		this.receiptDate = receiptDate;
		this.receiptTime = receiptTime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void ShowInfo( ) {
		System.out.printf("접수번호  : %s \n주소 : %s\n주문날짜/시간 : %s / %s\n전화번호 : %s\n가격 : %d\n메뉴번호 : %d", this.receiptNumber, this.address, this.receiptDate, this.receiptTime, this.PhoneNum, this.price, this.menuNumber);
	}
	
}
