package servlet.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatabaseConnection {
	private static DataSource dataSource = null;
	private static Connection conn = null;
	
	public static Connection connectDatabase() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Object o = initContext.lookup("java:/comp/env/jdbc/postgres");
		dataSource = (DataSource)o;
		conn = dataSource.getConnection();
		return conn;
	}

}
