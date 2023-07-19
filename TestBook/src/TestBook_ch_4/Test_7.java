package TestBook_ch_4;

import java.util.Scanner;

public class Test_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택 > ");
		int answer = sc.nextInt();
		
		while(true) {
			if(answer == 1) {
				System.out.println("예금액 > 10000");
				
			}
			
			if(answer == 2) {
				System.out.println("출금액 > 2000");
				break;
			}
			
			if(answer == 3) {
				System.out.println("잔고 > 8000");
				break;
			}
			
			if(answer == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
