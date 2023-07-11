package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2023/07/11
 * 이름 : 이규석
 * 내용 : PreparedInsert 실습하기
 * 
 */
public class PreparedUpdateTest {
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
			String sql = "Update `user2` set `hp` = ?, `age` = ? where `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 25);
			psmt.setString(3, "j101");
			// 4단계 - SQL 실행
			psmt.executeUpdate();
			
			// 5단계 - 결과처리
			
			// 6단계 - 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
