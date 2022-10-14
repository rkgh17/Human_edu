package exam09.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import exam09.domain.userinfo.Userinfo;
import exam09.domain.userinfo.dao.UserinfoDao;
import exam09.domain.userinfo.dao.mysql.UserinfoMysqlDao;
import exam09.domain.userinfo.dao.oracle.UserinfoOracleDao;

public class UserinfoClient {
	
	public static void main(String[] args) throws IOException {
		Userinfo userinfo = new Userinfo();
		userinfo.setUserId("human");
		userinfo.setPassword("12345");
		userinfo.setUserName("황지훈");
		
		UserinfoDao uid = null;
		
		FileInputStream fis = new FileInputStream ("src/exam09/userinfo/web/conf");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		System.out.println("dbType : " + dbType);
		
		
		if(dbType.equals("ORACLE")) {
			uid = new UserinfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			uid = new UserinfoMysqlDao();
		}
		uid.insertUserinfo(userinfo);
		uid.selectUserinfo(userinfo);
		uid.deleteUserinfo(userinfo);
		
		
	}

}
