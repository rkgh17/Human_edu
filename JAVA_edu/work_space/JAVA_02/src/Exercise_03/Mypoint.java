package Exercise_03;

public class Mypoint {
	int x;
	int y;
	
	public Mypoint (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x, int y) {
		
		return Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
	}

}
