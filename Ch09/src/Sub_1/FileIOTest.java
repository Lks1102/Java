package Sub_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2023/06/29
 * 이름 : 이규석
 * 내용 : Java File IO 실습
 *  
 *	입출력 스트림(Stream)
 *	- 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수정
 *	- 파일 입출력을 위해 스트림(데이터 연결 통로)사용
 *
 * 	ASCII : 서구권
 * 	UNICODE : 아시아권
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\issi0\\Desktop\\Sample_1.txt";
		String target = "C:\\Users\\issi0\\Desktop\\Sample_2.txt";
		
		
		try {
			
			// 스트림 생셩(연결)
			FileInputStream fis = new FileInputStream(path);
			// 
			FileOutputStream fos = new FileOutputStream(target);
			
			
			while(true) {
				
				// 파일 읽기
				int data = fis.read();
				
				if(data == -1) {
					// 파일을 모두 읽었을 때 반복 종료
					break;
				}
				// 숫자를 문자로 변환
				char ch = (char) data;
				
				System.out.print(ch);
				
				
				// 파일 쓰기
				fos.write(data);
				
				
			}
			
			fis.close();
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("프로그램 종료 ...");
		
	} // main end
}














