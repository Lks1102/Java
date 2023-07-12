package Sub_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/11
 * 이름 : 이규석
 * 내용 : 트랜잭션 실습하기
 * 
 * 	Transaction
 * 	- Transaction은 DB 처리의 최소 작업단위로 하나의 작업은 소작업으로 구성
 * 	- Transaction은 모두 성공 or 모두 실패 해야 함.
 * 	- commit은 모든작업 성공처리, rollback은 모든작업 실패처리
 * 
 */
public class TransactionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생하시겠습니까?");
		int answer = sc.nextInt();
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String pass = "1234";
		
		Connection conn = null;
		
		
		try {
			// 1단계 - JDBC 드라이버 로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB접속
			
			conn = DriverManager.getConnection(host, user, pass);
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);
			
			
			// 3단계 - SQL실행 객체 생성
			
			String sql1 = "Update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no` = ?";
			String sql2 = "Update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no` = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");

			// 4단계 - SQL실행
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("에러가 발생 했습니다!");
			}
			
			psmt2.executeUpdate();
			
			// 트랜잭션 확정 - 성공처리
			conn.commit();
			
			// 5단계 - 연결해제
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 트랜잭션 취소 - 실패처리
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("트랙잭션 완료...");
		
	}
}
