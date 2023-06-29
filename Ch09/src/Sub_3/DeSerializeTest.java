package Sub_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2023/06/29
 * 이름 : 이규석
 * 내용 : Java 역직렬화 실습
 *  
 *	- DeSerialize는 외부객체파일을 다시 자바 객체(인스턴스)로 생성하는 작업
 */
public class DeSerializeTest {
	
	public static void main(String[] args) {
	
		
		String path = "C:\\Users\\issi0\\Desktop\\Apple.txt";
		
		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			// 역직렬화
			Apple apple = (Apple)ois.readObject();
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
