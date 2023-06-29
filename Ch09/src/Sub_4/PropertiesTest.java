package Sub_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2023/06/29
 * 이름 : 이규석
 * 내용 : Java properties 실습하기
 * 
 *	Properties
 *	- 문자열 데이터만 취급하는 key - value 자료구조 클래스
 *	- 프로그램의 환경설정값을 저장할때 많이 사용
 *	- 입출력스트링으로 데이터 입출력
 *
 */
public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생성 (Map 인터페이스를 구현한 구현체, Key - Value 는 무조건 문자열.)
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		
//		System.out.println(prop);
		
		
		String path = "C:\\Users\\issi0\\Desktop\\Fruit.properties";
		
		// 프로퍼티 파일 저장
		
		
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프로퍼티 파일 읽기
		
		String target = "C:\\Users\\issi0\\Desktop\\Cities.properties";
		
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(propCities);
		System.out.println("한국 : " + propCities.getProperty("kor"));
		System.out.println("미국 : " + propCities.getProperty("usa"));
		System.out.println("일본 : " + propCities.getProperty("jp"));
		System.out.println("중국 : " + propCities.getProperty("ch"));
		
	System.out.println("프로그램 종료 ... ");	
		
	}
	
	
}
