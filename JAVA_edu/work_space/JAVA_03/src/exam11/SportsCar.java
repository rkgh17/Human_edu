package exam11;

public class SportsCar extends Car{

	@Override
	public int speedUp() {
		this.currentSpeed+=10;
		return this.currentSpeed;
	}

	@Override
	public int getCharge() {
		return 1450;
	}
	

}
