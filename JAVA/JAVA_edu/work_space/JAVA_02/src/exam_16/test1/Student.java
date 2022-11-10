package exam_16.test1;

public class Student {
	public String name;
	public int kor;
	
	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;

	}
	public void studentPrint( ) {
		System.out.printf("아룸 : %s \t 국어점수 : %d \n", this.name, this.kor);
	}

}
