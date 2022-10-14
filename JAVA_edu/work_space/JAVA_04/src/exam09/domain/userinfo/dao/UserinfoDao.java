package exam09.domain.userinfo.dao;

import exam09.domain.userinfo.Userinfo;

public interface UserinfoDao {
	public void insertUserinfo(Userinfo userid);
	public void selectUserinfo(Userinfo userid);
	public void deleteUserinfo(Userinfo userid);
	

}
