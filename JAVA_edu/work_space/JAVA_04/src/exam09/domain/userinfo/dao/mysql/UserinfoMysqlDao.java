package exam09.domain.userinfo.dao.mysql;

import exam09.domain.userinfo.Userinfo;
import exam09.domain.userinfo.dao.UserinfoDao;

public class UserinfoMysqlDao implements UserinfoDao{

	@Override
	public void insertUserinfo(Userinfo userInfo) {
		System.out.println("Insert Mysql : " + userInfo.getUserId());
		
	}

	@Override
	public void selectUserinfo(Userinfo userInfo) {
		System.out.println("Select Mysql : " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserinfo(Userinfo userInfo) {
		System.out.println("Delete Mysql : " + userInfo.getUserId());
		
	}
	

}
