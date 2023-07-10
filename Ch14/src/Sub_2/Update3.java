package Sub_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update3 {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "Update `user1` set ";
				   sql += "`hp` = '010-1234-3001', ";
				   sql += "`age` = 26 ";
				   sql += "where `uid` = 'd101' and `name` = '김유신'";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update3 완료");
	}
}
