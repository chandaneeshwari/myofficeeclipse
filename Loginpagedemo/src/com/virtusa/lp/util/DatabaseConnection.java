
package com.virtusa.lp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
//	 static Connection conn=null;
//	 public static Connection con() throws SQLException {
	
//	        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3360/demo", "root", "root");
//	        return conn;
//		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//}
	

//package com.virtusa.connection;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
////public class GetConnection {
private static Connection conn;
//public PreparedStatement ps,ps1,ps2;
//public ResultSet rs,rs1;
public static Connection con() {
try {
Class.forName("com.mysql.jdbc.Driver");
//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
return conn;
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");

return null;
}
public static Connection closeConnection() throws SQLException
{
 
	conn.close();
    return conn;
}
}