package Sub_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이규석
 * 내용 : Update 실습하기
 * 
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - 드라이버 로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 2단계 - DB 접속
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			// 뒷자리 1111 나이 25
			
			String sql = "UPDATE `User1` set ";
					sql += "`hp` = '010-1234-1111', ";
					sql += "`age` = 25 ";
					sql += "where `uid` = 'j101'";
					
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과처리
			
			
			
			// 6단계 - 연결해제
					stmt.close();
					conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Update 완료...");
	}
}
