package example8;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public int hashCode() {
		return this.studentNum;
		
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student st = (Student) obj;
		
		if(st.studentNum == studentNum)
			return true;
		else
			return false;
		}else
			return false;
		
	}

}
