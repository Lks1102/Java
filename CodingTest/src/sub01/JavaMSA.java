package sub01;

import java.util.Scanner;

public class JavaMSA {
	public static void main(String[] args) {
		
		System.out.println("예제입력");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println();
		System.out.println("예제출력");
		for (int i = 0; i < N; i++) {	
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");				
			}			
			for (int k = 0; k <= i; k++) {				
				System.out.print("*");				
			}			
			System.out.println();
		}
		
	}	
}
