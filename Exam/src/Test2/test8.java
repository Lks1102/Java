package Test2;
/*
 * 날짜 : 2023/06/15
 * 이름 : 이규석
 * 내용 : 자바 팩토리얼 재귀 메서드 연습문제
 */
public class test8 {
	public static void main(String[] args) {
		
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
		System.out.println("9! = " + factorial(9));
	}
	
	public static int factorial(int n) {
		
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}