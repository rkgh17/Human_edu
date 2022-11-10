package Exercise_01;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int total = this.eng+this.kor+this.math;
		return total;
	}
	public double getAverage() {
		double avg = Math.round((double)this.getTotal() / 3 * 10) / 10.0;
		return avg;
	}
	public String info() {
		return 
				this.name + "," + 
				this.ban + "," + 
				this.no + "," + 
				this.kor + "," + 
				this.eng + "," + 
				this.math + "," + 
				getTotal()+ "," + 
				getAverage();
	}

}
