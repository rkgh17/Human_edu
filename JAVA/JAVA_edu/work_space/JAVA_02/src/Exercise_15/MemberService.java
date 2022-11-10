package Exercise_15;

public class MemberService {
	public String id;
	public String password;

	public boolean login(String id, String password) {
		boolean a = false;
		if(id=="hong" && password == "12345")
			a = true;
		return a;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
