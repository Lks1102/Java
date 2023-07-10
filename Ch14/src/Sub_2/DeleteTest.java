package Sub_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이규석
 * 내용 : Delete 실습하기
 * 
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB 접속

			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			
			Statement stmt = conn.createStatement();
			
			// 4단계 -
			
			String sql = "Delete from `user1` ";
					sql += "where `uid` = 'j101' ";
			
			stmt.executeUpdate(sql);
			// 5단계 -
			// 6단계 -
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}
}
