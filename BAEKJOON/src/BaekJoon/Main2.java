package BaekJoon;

import java.util.Scanner;

// A + B - 3 (10950번)
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a + b;
		}
		sc.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
		
	}
}
