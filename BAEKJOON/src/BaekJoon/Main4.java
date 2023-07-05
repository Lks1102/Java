package BaekJoon;

import java.util.Scanner;

/*
 *  25304 영수증
 */
public class Main4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		
		// int a,b N번 만큼 반복해야하기 때문에 for문 밖에 두면 안됨.
		
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			X = X - (a*b);

		}
		if(X == 0) System.out.println("Yes");
		else System.out.println("No");
		
		
	}
}
