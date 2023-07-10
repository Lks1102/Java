package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select3 {
	public static void main(String[] args) {
		
		
		
		String host = "jdbc:mysql://localhost:3306/university";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "select * from lectures";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String lecNo = rs.getString(1);
				String proNo = rs.getString(2);
				String lecName = rs.getString(3);
				int lecCredit = rs.getInt(4);
				int lecTime = rs.getInt(5);
				String lecClass = rs.getString(6);
				
				System.out.printf("%s, %s, %s, %d, %d, %s\n", lecNo, proNo, lecName, lecCredit, lecTime, lecClass);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Select3 완료...");
		
	}
}
