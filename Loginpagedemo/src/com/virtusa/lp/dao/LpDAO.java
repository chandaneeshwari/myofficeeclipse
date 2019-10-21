package com.virtusa.lp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.log4j.Logger;

import com.virtusa.lp.util.DatabaseConnection;
import com.virtusa.lp.model.Lp;
import com.virtusa.lp.model.Module;
import com.virtusa.lp.model.Venue;

public class LpDAO {
	
	public int checkLogin(int lpId, String lpPass) throws SQLException {
		
	        int flag=0;
	        try {
	        	Connection connect = DatabaseConnection.con();
	        	PreparedStatement st = connect.prepareStatement("select id,pass from lp1 where id =? ");
	            st.setInt(1,lpId);
	            ResultSet result = st.executeQuery();
	            if(result.next()) {
	                if(((result.getInt(1))==(lpId) && (result.getString(2)).equals(lpPass))) {
	                    flag=result.getInt(1);
	                    }
	                connect.close();
	            }
	            else {
	            	connect.close();
	                flag=0;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	       
		return flag;
	}
//	public List<Lp> allLp() throws SQLException
//	{
//		List<Venue> allvenue = new ArrayList<>();
//		String sql = "SELECT id,name FROM lp1";
//        Connection connect = AdminConnection.con();
//        Statement statement = connect.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next())
//        {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            Lp  = new Venue(id, name, address);
//            allvenue.add(venue);
//        }
//        resultSet.close();
//        statement.close();
//        return allvenue;
//    }
	public List<Module> foundationModule() throws SQLException
    {
        List<Module> allModule = new ArrayList<>();
        String sql = "SELECT * FROM module1 where module_id=1 ";
        Connection connect = DatabaseConnection.con();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            int id = resultSet.getInt("module_id");
            String sDate = resultSet.getString("start_date");
            String eDate = resultSet.getString("end_date");
            String topic = resultSet.getString("topic");
            Module module = new Module(id, sDate,eDate, topic);
            allModule.add(module);
            
        }
        resultSet.close();
        statement.close();
        connect.close();
       
        return allModule;
    }
	public List<Module> advanceModule() throws SQLException
    {
        List<Module> allModule = new ArrayList<>();
        String sql = "SELECT * FROM module1 where module_id=2 ";
        Connection connect = DatabaseConnection.con();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
            int id = resultSet.getInt("module_id");
            String sDate = resultSet.getString("start_date");
            String eDate = resultSet.getString("end_date");
            String topic = resultSet.getString("topic");
            Module module = new Module(id, sDate,eDate, topic);
            allModule.add(module);
        }
        resultSet.close();
        statement.close();
        connect.close();
        return allModule;
	}
}