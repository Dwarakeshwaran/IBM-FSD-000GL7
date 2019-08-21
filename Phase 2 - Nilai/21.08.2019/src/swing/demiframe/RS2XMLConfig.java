package swing.demiframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class RS2XMLConfig {

	
	private Connection conn = null;
	
	public RS2XMLConfig() throws SQLException {
		if(conn == null) {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "admin", "pass");
		}	
	}
	
	public ResultSet getEmployees() throws SQLException {
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery("select eid as ID , fname as FNAME , lname as LNAME , email as Email from employee");
		
		return rs;
		
	}
}














