package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Properties;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		System.out.println("JDBC Connection");
		
		//Register Driver
		DriverManager.registerDriver(new org.h2.Driver());
		Class.forName("org.h2.Driver");
		
		//Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb" , "admin", "pass");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		//stmt.executeQuery("insert into student values('Suman',2,9)");
		 System.out.println("NAME ID GPA"); 
		 while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)); 
			//System.out.printf("\n%d %s %d",rs.getString(1),rs.getInt(2),rs.getInt(3)); 
		}
	}
}
