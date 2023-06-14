package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023-06-13
 * 이름 : 이규석
 * 내용 : Switch 문 실습
 */
public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("숫자 입력 : ");
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		System.out.println("입력한 숫자 : " + number);
		
		switch(number % 2) {
		
		case 0:
			System.out.println("number은 짝수");
			break;
		case 1:
			System.out.println("number은 홀수");
			break;
		}
	}
}