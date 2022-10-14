package examShape;

public class Circle extends Shape{
	private double r;
	public static final double PI = Math.PI;

	public Circle(double d) {
		this.r = d;
	}

	@Override
	public double calcArea() {
		return this.r*this.r*PI;
		
	}

}
