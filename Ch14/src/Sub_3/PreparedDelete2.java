package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDelete2 {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/shopping";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// JDBC 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL실행 객체 생성
			String sql = "Delete from `categories` where `cateNo` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, 20);
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 연결해제
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}
}
