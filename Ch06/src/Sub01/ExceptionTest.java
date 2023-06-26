package Sub01;

import java.util.Iterator;

/*
 * 날짜 : 2023/06/26
 * 이름 : 이규석
 * 내용 : 예외처리 (Exception) 실습
 * 
 * 일반적인 경우 Exception을 사용함
 * 예외처리(Exception)
 * 	- 예외는 프로그램 실행중에 발생하는 모든 에러
 * 	- 실행중(RunTime)에 발생하는 예외와, 컴파일 타임(compileTime)에 발생하는 예외처리.
 * 	- 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 * 	- 사용자가 생성한 예외를 throw
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		//실행 예외
		
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;
		
		try {
			//문제가 될 만한 코드만 거는게 아니라 통일성을 위해 전체적으로 try문을 사용해도 문제없다
		rs1 = num1 + num2;
		rs2 = num1 - num2;
		rs3 = num1 * num2;
		rs4 = num1 / num2;
		}catch (ArithmeticException e) {
			//예외가 발생 했을 경우 처리할 코드 작성
			//예외상황1 : 어떤 수를 0으로 나눌 경우
			e.printStackTrace();
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		
		
		int arr[] = {1, 2, 3, 4, 5};
		
		try {
			for(int i = 0; i < 6; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//예외상황2 : 배열의 인덱스 범위를 벗어날 경우
			e.printStackTrace();
		}
		
		//예외상황3 :
		Animal ani = null;
		try {
		ani.move();
		ani.hunt();
		}catch (NullPointerException e) {
			//객체가 생성 없이 참조(nullPointer)
			e.printStackTrace();
		}
		
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Eagle(); //업캐스팅
		Animal a3 = new Shark(); //업캐스팅
		
		try {
		Eagle eagle = (Eagle)a1; //다운캐스팅
		Shark shark = (Shark)a2; //다운캐스팅
		Tiger tiger = (Tiger)a3; //다운캐스팅
		}catch (ClassCastException e) {
			//잘못된 캐스팅
			e.printStackTrace();
		}
		
		
		//일반 예외
		//클래스명으로 직접 호출(StaticMethod)
		try {
			Class animal = Class.forName("sub01.Lion");
		} catch (ClassNotFoundException e) {
			//찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			//예외처리 발생 유무와 상관없이 마지막에 항상 실행되는 코드
			System.gc(); //메모리 정리
			System.out.println("finally 실행...");
		}
		
		System.out.println("프로그램 정상 종료...");
	}
}
