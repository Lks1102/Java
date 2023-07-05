package BaekJoon;

import java.util.Scanner;

/*
 *  25314
 *  코딩은 체육과목 입니다.
 */
public class Main5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int LP = N / 4;
		
		
		
		String word = "long ";
		
		for (int i = 1; i <= LP; i++) {
			System.out.print(word);
		}
		System.out.println("int");
		
	}
}
