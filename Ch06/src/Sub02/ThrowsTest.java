package Sub02;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/26
 * 이름 : 이규석
 * 내용 : Java Throws 실습
 */
public class ThrowsTest {
	
	public static void main(String[] args) throws Exception {
		
		try {
			myMethod1(10);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}
	
	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int n2 = scan.nextInt();
		
		int result = n1/n2;
		
		System.out.println("result : " + result);
	}
	
}
