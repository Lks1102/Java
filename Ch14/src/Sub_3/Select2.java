package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select2 {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "Select * from `user4`";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int seq = rs.getInt(1);
				String name = rs.getString(2);
				int gender = rs.getInt(3);
				int age = rs.getInt(4);
				String addr = rs.getString(5);
				
				System.out.printf("%d, %s, %d, %d, %s\n", seq, name, gender, age, addr);
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Select2 완료");
	}
}
