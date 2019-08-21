package swing.demiframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class DataBase {
	
	public Integer id;
	public String fname;
	public String lname;
	public String email;
	public Connection conn=null;
	public PreparedStatement pstmt;

	public DataBase() {
		super();
	}

	public DataBase(int id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public void createConnection() throws SQLException, ClassNotFoundException {
		if(conn ==null) {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "admin", "pass");
		}
	}
	public void addRecord() throws SQLException {
		pstmt = (PreparedStatement) conn.prepareStatement("insert into employee values(?,?,?,?)");
		pstmt.setInt(1, this.id);
		pstmt.setString(2, this.fname);
		pstmt.setString(3, this.lname);
		pstmt.setString(4, this.email);
		pstmt.executeUpdate();
	}
	
	public void deleteRecord(Integer id) throws SQLException {
		
		pstmt = (PreparedStatement) conn.prepareStatement("delete from employee where eid = ?");
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
}




