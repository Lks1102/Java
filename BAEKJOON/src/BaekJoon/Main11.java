package BaekJoon;

import java.util.Scanner;

/*
 * A + B - 5
 * 10952번
 */
public class Main11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		
		while (true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				sc.close();
				break;
			}
			System.out.println(a+b);
			
		}
	}
}
