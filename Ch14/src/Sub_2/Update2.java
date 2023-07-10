package Sub_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update2 {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "Update `user1` set ";
					sql += "`hp` = '010-1234-2001', ";
					sql += "`age` = 29 ";
					sql += "where `uid` = 'c101'";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
