package Exam_08;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(5000, "황지훈");
		Student s2 = new Student(10000, "황혜린");
		Bus bus1 = new Bus(1,10,10000);
		Bus bus2 = new Bus(2,5,5000);
		Subway sw1 = new Subway(1,50,20000);
		Student s3 = new Student(20000, "누구냐");
		Taxi taxi1 = new Taxi(1, 50000);
		
		s1.takeBus(bus1);//s1학생이 bus1을 탐
		s1.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("--------------------------------------------");
		s1.getoffbus(bus1);
		s1.takeBus(bus2);
		s1.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("--------------------------------------------");
		
		s2.takeBus(bus2); //s2학생이 bus2를 탐
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("--------------------------------------------");
		
		s2.takeSW(sw1); //s2학생이 sw1지하철을 탐
		s2.getoffbus(bus2);
		s1.showInfo();
		s2.showInfo();
		sw1.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("--------------------------------------------");
		
		s3.takeTaxi(taxi1);
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		sw1.showInfo();
		taxi1.showInfo();
		
		

	}

}
