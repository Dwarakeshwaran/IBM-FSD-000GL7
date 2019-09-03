package animeservlet.model.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import animeservlet.model.DatabaseConnection;

public class Service {

	public void insertData(String name, String genre, int year, int rating) throws NamingException, SQLException {
		Connection con = DatabaseConnection.createConnection();
		PreparedStatement ps = con.prepareStatement("insert into animelist values(?,?,?,?)");
		
		ps.setString(1, name);
		ps.setString(2, genre);
		ps.setInt(3, year);
		ps.setInt(4, rating);
		
		ps.executeUpdate();
	}
	
	public ResultSet showData() throws NamingException, SQLException {
		Connection con = DatabaseConnection.createConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from animelist");
		return rs;
	}
	
	public void deleteData(String data) throws NamingException, SQLException {
		Connection con = DatabaseConnection.createConnection();
		PreparedStatement s = con.prepareStatement("delete from animelist where name = ?");
		s.setString(1,data);
		s.executeUpdate();
		
		
	}
}
