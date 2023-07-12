package Sub_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

class User1VO {
	private String dep_no;
	private String dep_name;
	private String dep_manager;
	private String dep_tel;
	
	public String getDep_no() {
		return dep_no;
	}
	public void setDep_no(String dep_no) {
		this.dep_no = dep_no;
	}
	
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	public String getDep_manager() {
		return dep_manager;
	}
	public void setDep_manager(String dep_manager) {
		this.dep_manager = dep_manager;
	}
	
	public String getDep_tel() {
		return dep_tel;
	}
	public void setDep_tel(String dep_tel) {
		this.dep_tel = dep_tel;
	}
}

public class PreparedSelect2 {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/hospital";
		String user = "root";
		String pass = "1234";
		
		List<User1VO> users = new ArrayList<>();
		
		try {
			
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			String sql = "Select * from `departments`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 결과 처리
			
			while(rs.next()) {
				// VO 객체 생성 및 초기화
				User1VO vo = new User1VO();
				vo.setDep_no(rs.getString(1));
				vo.setDep_name(rs.getString(2));
				vo.setDep_manager(rs.getString(3));
				vo.setDep_tel(rs.getString(4));
				
				// VO객체 저장
				users.add(vo);
				
			}
			
			// 연결 해제
			rs.close();
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//List 결과출력
		for(User1VO vo : users) {
			System.out.println("-------------");
			System.out.println("부서번호 : " + vo.getDep_no());
			System.out.println("부서이름 : " + vo.getDep_name());
			System.out.println("매니저 : " + vo.getDep_manager());
			System.out.println("부서 전화번호 : " + vo.getDep_tel());
		}
		
		
	} // main 종료
}
