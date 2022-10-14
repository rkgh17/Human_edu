package examShape;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle1 = new Circle(10.0);
		Shape circle2 = new Circle(20.0);
		Shape rect1 = new RectAngle(5,5);
		Shape rect2 = new RectAngle(10,5);
		
		System.out.printf("원1의 넓이는 %.5f입니다. \n", circle1.calcArea());
		System.out.printf("원2의 넓이는 %.5f입니다. \n", circle2.calcArea());
		System.out.printf("사각형1의 넓이는 %.5f입니다. \n", rect1.calcArea());
		System.out.printf("사각형2의 넓이는 %.5f입니다. \n", rect2.calcArea());

	}

}
