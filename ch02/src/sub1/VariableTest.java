package sub1;
/**
 * 날짜 : 2023-06-12
 * 이름 : 이규석
 * 내용 : Ch02.Java 변수와 연산자 실습
 * @author issi0
 *
 */
public class VariableTest {
	
	public static void main(String[] args) {
	// 변수 (variable)
	// 데이터 처리를 위한 그릇
	// 변수는 메모리 고악ㄴ, 각 종류에 따라 크기가 다름
	int a = 3;
	int b = 7;	
		
	a = 5;
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	
	String name = "홍길동";
	System.out.println(name + "님 반갑습니다.");
	
	// 상수(constant) 고정된 값 - 대문자로 표기
	final int NUM = 5;
	System.out.println("NUM : " + NUM);
	
		
	}
}
