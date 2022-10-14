package exam09.domain.userinfo.dao.oracle;

import exam09.domain.userinfo.Userinfo;
import exam09.domain.userinfo.dao.UserinfoDao;

public class UserinfoOracleDao implements UserinfoDao{

	@Override
	public void insertUserinfo(Userinfo userInfo) {
		System.out.println("Insert ORACLE : " + userInfo.getUserId());
		
	}

	@Override
	public void selectUserinfo(Userinfo userInfo) {
		System.out.println("Select ORACLE : " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserinfo(Userinfo userInfo) {
		System.out.println("Delete ORACLE : " + userInfo.getUserId());
		
	}
	

}
