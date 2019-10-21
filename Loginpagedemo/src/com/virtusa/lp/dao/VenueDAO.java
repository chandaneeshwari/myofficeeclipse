package com.virtusa.lp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import org.apache.log4j.Logger;
import com.virtusa.lp.util.DatabaseConnection;
import com.virtusa.lp.model.Venue;
	public class VenueDAO {
		
		PreparedStatement preparedStatement=null;
		 List<Venue> allvenue = new ArrayList<>();
		public List<Venue> allVenue() throws SQLException
	    {
		
			Connection connect = DatabaseConnection.con();
	        String sql = "SELECT * FROM venue1"+" ORDER BY capacity ASC";
	        Statement statement = connect.createStatement();
	        ResultSet resultSet = statement.executeQuery(sql);
	        while (resultSet.next())
	        {
	            int id = resultSet.getInt("capacity");
	            String name = resultSet.getString("name");
	            String address = resultSet.getString("location");
	            Venue venue = new Venue(id, name, address);
	            allvenue.add(venue);
	        }
	        resultSet.close();
	        statement.close();

	        return allvenue;
	    }
		public void addVenue(int capacity,String name,String location) throws SQLException
		{		Connection connect=null;
				try {
					 connect =DatabaseConnection.con();
				} catch (Exception e) {
					e.printStackTrace();
				}
			try {
				preparedStatement = connect.prepareStatement("insert into venue1(capacity,name,location) values(?,?,?)");
				preparedStatement.setInt(1,capacity);
				preparedStatement.setString(2,name);
				preparedStatement.setString(3,location);
				preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			preparedStatement.close();
			connect.close();
		}
		public void deleteVenue(String name) throws SQLException {
			Connection connect=null;
				try {
				 connect = DatabaseConnection.con();
				} catch (Exception e) {
					e.printStackTrace();
				}
			try {
				preparedStatement = connect.prepareStatement("delete from venue1 where name=?");
				preparedStatement.setString(1, name);
				preparedStatement.executeUpdate();
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			preparedStatement.close();
			connect.close();
		}
		
			
	}