package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2023/07/11
 * 이름 : 이규석
 * 내용 : Prepared 실습하기
 * 
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 - DB접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 3단계 - SQL실행 객체 생성
			String sql = "Delete from `user2` where `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			// 4단계 - SQL실행
			psmt.executeUpdate();
			
			// 6단계 - 연결해제
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}
}
