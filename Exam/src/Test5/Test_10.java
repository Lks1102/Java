package Test5;

import java.util.Scanner;

/*
 * 	날짜 : 2023/07/17
 * 	이름 : 이규석
 */
public class Test_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			int fact = 1;
			for(int j = 2; j <= i; j++) {
				fact *= j;
			}
			sum += fact;
			System.out.printf("%2d! = %,10d\n", i, fact);
		}
		System.out.printf("1! + 2! + ..... + %d! = %,d\n",n ,sum);
		sc.close();
		
	}
}
