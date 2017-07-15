package tw.brad.beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * JavaBean rules
 * 1. implements Serializable
 * 2. public class
 * 3. field member can not a public
 * 4. getter & setter => getXxx, setXxx => field xxx
 * 5. none argument Constructor (default Constructor)
 */
//public class Member implements Serializable {
public class MemberV2 {	
	private String name, passwd, realname;
	private Connection conn;
	
	public MemberV2() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:9487", "root", "root");
	}
	public void setName(String name) {this.name=name;}
	public void setPasswd(String passwd) {this.passwd=passwd;}
	public void setRealname(String realname) {this.realname=realname;}
	public String getName() {return name;}
	public String getPasswd() {return passwd;}
	public String getRealname() {return realname;}

	public boolean newInsert() throws Exception {
		
	}
	
}
