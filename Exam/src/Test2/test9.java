package Test2;
/*
 * 날짜 : 2023/06/15
 * 이름 : 이규석
 * 내용 : 자바 최대공약수 재귀 메서드 연습문제
 */
public class test9 {
	public static void main(String[] args) {
		
		System.out.println("1과 5의 최대공약수 : " + gcd(5, 1));
		System.out.println("3과 6의 최대공약수 : " + gcd(6, 3));
		System.out.println("12와 18의 최대공약수 : " + gcd(18, 12));
		System.out.println("60과 24의 최대공약수 : " + gcd(60, 24));
		System.out.println("192와 162의 최대공약수 : " + gcd(192, 162));
	}
	
	public static int gcd(int a , int b ) {
		
		if(a % b == 0) {
			return b;
		}else {
			return gcd(b, a%b);
		}
	}
}