package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedInsert2 {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/shopping";
		String user = "root";
		String pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "Insert into `categories` Values (?, ?)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20);
			psmt.setString(2, "Apple");
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료");
		
	}
}
