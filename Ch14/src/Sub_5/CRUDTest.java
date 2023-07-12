package Sub_5;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/12
 * 이름 : 이규석
 * 내용 : CRUD 실습하기
 * 
 * CRUD
 * 	- Create, Read, Update, Delete
 * 	- 데이터 베이스의 기본 처리 기능을 의미
 * 	- Insert, Select, Update, Delete 처리기능
 * 
 *	DAO ( DAO , VO 는 한세트)
 *	- Data Access Object
 *	- DB CRUD 처리 객체
 * 
 */
public class CRUDTest {
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("회원관리매니저 v1.0");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료 : 0, 입력 : 1, 조회 : 2, 검색 : 3, 수정 : 4, 삭제 : 5");
			System.out.print("선택 : ");
			int answer = sc.nextInt();
			
			
			if (answer == 0) {
				break;
			}else if (answer == 1) {
				
				UserVO vo = new UserVO();
				
				System.out.print("아이디 입력 : ");
				vo.setUid(sc.next());
				
				System.out.print("이름 입력 : ");
				vo.setName(sc.next());
				
				System.out.print("전화번호 입력 : ");
				vo.setHp(sc.next());
				
				System.out.print("나이 입력 : ");
				vo.setAge(sc.nextInt());
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("insert 완료...");
			
			}else if (answer == 2) {
				// 조회
				List<UserVO> users = UserDAO.getInstance().selectUsers();
				
				System.out.println("--------------전체조회-------------");
				for(UserVO user : users) {
					System.out.println(user);
				}
			}
			
			
		}
		
		
		System.out.println("회원관리매니저 종료....");
		
		
	} // main end
}
