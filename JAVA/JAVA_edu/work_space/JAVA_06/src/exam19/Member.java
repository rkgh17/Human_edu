package exam19;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name) * 1;
		//name.compareTo(on.name) * -1 은 내림차순
	}

}
