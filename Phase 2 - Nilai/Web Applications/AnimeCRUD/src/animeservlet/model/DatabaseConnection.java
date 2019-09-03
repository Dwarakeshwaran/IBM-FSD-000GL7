package animeservlet.model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatabaseConnection {
	private static DataSource dataSource = null;
	private static Connection conn = null;
	
	public static Connection createConnection() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Object o = initContext.lookup("java:/comp/env/jdbc/postgres");
		dataSource = (DataSource)o;
		conn = dataSource.getConnection();
		System.out.println("Connection created");
		return conn;
		
	}
}
