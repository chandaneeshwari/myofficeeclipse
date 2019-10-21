package com.virtusa.lp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import org.apache.log4j.Logger;
import com.virtusa.lp.util.DatabaseConnection;

public class AdminDAO {

  public int checkLogin(int id,String pass) throws SQLException{
	        int flag=0;
	        try
	        {
	        	Connection conn=DatabaseConnection.con();
	        	PreparedStatement stmt= conn.prepareStatement("select admin_id,password from admin1 where admin_id =? and password=?");
	            stmt.setInt(1, id);
	            stmt.setString(2, pass);
	            ResultSet rs = stmt.executeQuery();
	            if(rs.next())
	            {
	            	if(((rs.getInt(1))==(id) && (rs.getString(2)).equals(pass))) {
	                    flag=rs.getInt(1);
	                }
	            	   conn.close();
	            }
	            else {
	                flag=0;
	                conn.close();
	            }
	        } catch (SQLException e) {
	        	
	            e.printStackTrace();
	        }
	     
	        return flag;
	        }  
	   
     }