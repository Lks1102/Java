package Sub_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 날짜 : 2023/07/06
 * 이름 : 이규석
 * 내용 : 채팅 프로그래밍 실습
 */
public class ThreadReceiver extends Thread {

	private Socket socket;
	
	public ThreadReceiver(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	
}
