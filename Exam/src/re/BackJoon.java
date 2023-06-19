package re;

import java.util.Scanner;

public class BackJoon {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = sc.nextInt();		
		num2 = sc.nextInt();
		int a = num1 * (num2 % 10);
		int b = num1 * ((num2/10) % 10);
		int c = num1 * (num2 / 100);
		int result = num1 * num2;
		
		sc.close();
	}
}
