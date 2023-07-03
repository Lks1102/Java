package Sub_4;
/*
 * 날짜 : 2023/07/03
 * 이름 : 이규석
 * 내용 : Java DaemonThread 실습하기
 * 
 * 	DaemonThread
 * 	- 메인스레드를 보조하는 보조스레드
 * 	- 메인스레드가 종료되면 데몬스레드도 같이 종료
 */
public class DaemonThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread st = new SubThread();
		st.setDaemon(true); // 데몬스레드 설정
		
		
		st.start();
		
		for (int i = 1; i <+ 10; i++) {
			
			Thread.sleep(1000);
			System.out.println("Main Thread Start...");
			
		}
		System.out.println();
		System.out.println("프로그램 종료...");
		
	}
}
