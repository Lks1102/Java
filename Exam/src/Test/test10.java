package Test;

/*
 *  날짜 : 2023/06/13
 *  이름 : 이규석
 *  내용 : 자바 피보나치 수열 연습문제
 */

public class test10 {
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1 + ", ");
		System.out.print(n2 + ", ");
		
		for(int i = 1; i <= 10; i++) {
			
			n3 = n1 + n2;
			//1 =0 + 1
			// 2=1 + 1
			//3 = 1 + 2
			//5 = 2 + 3
			//8 = 5 + 3
			//13 = 8 + 5
			//21 = 13 + 8
			System.out.print(n3 + ", ");
			
			n1 = n2;
			//n1 =1  <n2 =1
			//1=1
			//2
			//3
			//5
			//8
			
			n2 = n3;
			//1<1
			//2=2
			//3=3
			//5=5
			//8
			//13
		}
	}
}