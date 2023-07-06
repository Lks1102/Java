package BaekJoon;

import java.util.Scanner;

/*
 * 별찍기
 * 2438번
 */
public class Main9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
		
	}

}
