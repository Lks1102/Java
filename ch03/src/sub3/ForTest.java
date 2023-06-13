package sub3;
/*
 * 날짜 : 2023-06-13
 * 이름 : 이규석
 * 내용 : 반복문 for 실습
 */
public class ForTest {
	public static void main(String[] args) {
		//for
		//for(초기 ; 조건; 증감) {}
		for (int i = 1; i <= 5; i++) {
		System.out.println("i : " + i);	
		}
		System.out.println("-----------------");
		//1~10까지 합
		int sum = 0;
		
		for (int k = 1; k <= 10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		System.out.println("----------------");
		//1~10까지 짝수합
		
		int sum1 = 0;
		
		for (int k = 0; k <= 10; k += 2) {
			sum1 += k;
		}
		System.out.println("1부터 10까지 짝수 합 : " + sum1);
		
		System.out.println("------------------");
		//for 중첩
		
		for(int a = 1; a <= 3; a++) {
			System.out.println("a : " + a);
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
				for(int c = 1; c <=7; c++) {
					System.out.println("c : " + c);
				}
			}
		}
		System.out.println("------------------");
		//구구단
		
		for(int x = 2; x <=9; x++) {
			for(int y = 1; y <=9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
		}
		System.out.println("------------------");
		//별삼각형
		
		for (int start = 10; start >= 1; start--) { //세로줄
			
			for (int end = 1; end <= start; end++) {//가로줄
				
				System.out.print("★");			
			}
			System.out.println();
		}
	}
}
