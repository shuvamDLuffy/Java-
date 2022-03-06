package database;
import java.sql.*;

public class connectDB 
{
	static final String driver = "com.mysql.cj.jdbc.Driver";

	public Connection connect(){
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_swing", "admin", "1234");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}
