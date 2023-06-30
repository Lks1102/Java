package BaekJoon;

import java.util.Scanner;
// 구구단
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			int re = a*i;
			
			System.out.println(a + " * " + i + " = " + re);
			
		}
	}
}
