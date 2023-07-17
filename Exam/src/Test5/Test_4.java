package Test5;
/*
 * 	날짜 : 2023/07/17
 * 	이름 : 이규석
 */
public class Test_4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);

		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);
		
		System.out.println(a > b ^ a  == 10);
		System.out.println(a > b ^ a == b);
		System.out.println(true ^ false);
		
		System.out.println(!(a > b));
		System.out.println(!(a < b));
		
	}
}
