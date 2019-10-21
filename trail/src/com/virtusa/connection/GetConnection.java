package com.virtusa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
private static Connection conn;
public PreparedStatement ps,ps1,ps2;
public ResultSet rs,rs1;
public static Connection getMySqlconnection() {
try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {
//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","system");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
    return conn;
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
}
