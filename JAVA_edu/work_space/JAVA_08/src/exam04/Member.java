package exam04;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			return (this.name.equals(mem.name)) 
					&& this.age == mem.age;
			// 1. hashCode가 같은지?
			// 2. m3.equals(m1 or m2)가 true인지?
		}
		else {
			return false;
		}
	}

}
