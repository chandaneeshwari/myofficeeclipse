package com.virtusa.lp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import org.apache.log4j.Logger;
import com.virtusa.lp.util.DatabaseConnection;
public class MentorDAO {
	
	public int checkLogin(int mentorId, String mentorPass) throws SQLException {
		
			        int flag=0;
	        Connection connect = DatabaseConnection.con();
	        PreparedStatement preparedStatement = connect.prepareStatement("select mentor_id,password from Mentor1 where mentor_id =? ");
	        	preparedStatement.setInt(1,mentorId);
	            ResultSet result = preparedStatement.executeQuery();
	            if(result.next()) {
	                if(((result.getInt(1))==(mentorId) && (result.getString(2)).equals(mentorPass))) {
	                    flag=result.getInt(1);
	                    
	                }
	            }
	            else
	                flag=0;
	        
	        preparedStatement.close();
	        connect.close();
		return flag;
	}
	public void addbatch(int batch_id,String batch_name,int batch_size) throws SQLException
	{
			
		try {
			Connection connect = DatabaseConnection.con();
			 PreparedStatement preparedStatement = connect.prepareStatement("insert into batch1(batch_id,batch_name,batch_size) values(?,?,?)");
			preparedStatement.setInt(1,batch_id);
			preparedStatement.setString(2, batch_name);
			preparedStatement.setInt(3,batch_size);
			preparedStatement.executeUpdate();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	public int checkSize(int batch_size,String batch_name) throws SQLException
	{
		
		        int flag=0;
		        try {
		        	Connection connect = DatabaseConnection.con();
		        	 PreparedStatement preparedStatement = connect.prepareStatement("select size from sample.batch3 where batch_name =? ");
		        	preparedStatement.setString(1,batch_name);
		            ResultSet result = preparedStatement.executeQuery();
		            if(result.next()) {
		                if(((result.getInt(1))==(batch_size)) && ((result.getString(1)).equals(batch_name))) {
		                	
		                    flag=result.getInt(1);
		                    
		                }
		            }
		            else
		                flag=0;
		        } catch (SQLException e) {
		        	e.printStackTrace();
		        }
		      
			return flag;
	}
	public void addlp(int id,int batch_id, String name, long phone, String pass) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Connection connect = DatabaseConnection.con();
			 PreparedStatement preparedStatement = connect.prepareStatement("insert into lp1(batch_id,id,name,phone,pass) values(?,?,?,?,?)");
			preparedStatement.setInt(1,id);
			preparedStatement.setInt(2,batch_id);
			preparedStatement.setString(3,name);
			preparedStatement.setLong(4,phone);
			preparedStatement.setString(5,pass);
			preparedStatement.executeUpdate();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public int count(int batch_id1) throws SQLException {
       
            int flag=0;
            try {
            	Connection connect = DatabaseConnection.con();
            	PreparedStatement preparedStatement = connect.prepareStatement("select COUNT(*) FROM sample.lp1 where batch_id=? ");
            	preparedStatement.setInt(1,batch_id1);
                ResultSet result = preparedStatement.executeQuery();
                while(result.next()) {                  
                        flag=result.getInt(1);
                      
                    }
                }
                 catch (SQLException e) {
                	 e.printStackTrace();
            }
            
        return flag;
       
    }
	public int batchSize(int batch_id) throws SQLException
    {
                int flag=0;
                try {
                	Connection connect = DatabaseConnection.con();
                	 PreparedStatement preparedStatement = connect.prepareStatement("select size from batch1 where batch_id=? ");
                	preparedStatement.setInt(1,batch_id);
                    ResultSet result = preparedStatement.executeQuery();
                    while(result.next()) {
                        flag=result.getInt(1);
                        }
                    }
                   
                 catch (SQLException e) {
                	 e.printStackTrace();
                }
                
            return flag;
    }
	public void addFoundationModule(int id,String sDate,String eDate,String title) throws SQLException
	{
			
		try {
			Connection connect = DatabaseConnection.con();
			 PreparedStatement preparedStatement = connect.prepareStatement("insert into module1(module_id,start_date,end_date,topic) values(?,?,?,?)");
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,sDate);
			preparedStatement.setString(3,eDate);
			preparedStatement.setString(4,title);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}