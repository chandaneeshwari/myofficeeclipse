
package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.connection.GetConnection;

public class UserDAO {
	public boolean validateUser(String uName,String pass,String type) {
	String sql="select *from user where user_name=? and user_password=? and user_type=? ";
GetConnection gc=new GetConnection();
try {
gc.ps=GetConnection.getMySqlconnection().prepareStatement(sql);
gc.ps.setString(1, uName);
gc.ps.setString(2, pass);
gc.ps.setString(3, type);
gc.rs=gc.ps.executeQuery();
return gc.rs.next();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
 return false;
}
}