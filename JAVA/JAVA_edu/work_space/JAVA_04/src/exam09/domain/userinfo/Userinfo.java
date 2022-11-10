package exam09.domain.userinfo;

public class Userinfo {
	private String userId;
	private String password;
	private String userName;
	
	public Userinfo() {
	}
	// 생략 가능
	
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
