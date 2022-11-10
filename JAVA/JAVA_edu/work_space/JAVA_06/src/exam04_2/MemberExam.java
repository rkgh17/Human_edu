package exam04_2;

public class MemberExam {
	public static void main(String[] args) {
		
		int [] a = {10,20,30};
		
		Member original = new Member("blue",
				"홍길동", "12345", 25, true, a,
				new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		cloned.a[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체]");
//		System.out.println("id: "+cloned.id);
//		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("a: "+cloned.a[0]);
		System.out.println("car: "+cloned.car.model);
//		System.out.println("age: "+cloned.age);
//		System.out.println("adualt: "+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체]");
//		System.out.println("id: "+original.id);
//		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("a: "+original.a[0]);
		System.out.println("car: "+original.car.model);
//		System.out.println("age: "+original.age);
//		System.out.println("adualt: "+original.adult);
	}

}
