package BaekJoon;

import java.util.Scanner;

/*
 * 	8393번 합
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		
		for (int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		System.out.println(sum);
	}
}

//
//int sum = 0;
//
//for (int k = 1; k <= 10; k++) {
//	sum += k;
//}