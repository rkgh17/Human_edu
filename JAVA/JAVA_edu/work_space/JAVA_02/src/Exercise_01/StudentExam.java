package Exercise_01;

public class StudentExam {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		
		System.out.println( s.info() );
	}

}
