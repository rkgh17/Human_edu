package examShape;

public class RectAngle extends Shape{
	private int width;
	private int height;
	
	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double calcArea() {
		return this.width * this.height ;
	}

}
