/*
 * 2023/06/15
 * 배열 정리
 */
import java.util.Scanner;



public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();				
		
		System.out.println("시험 점수는 : " + x);
		if( x >= 90 && x <= 100) {
			
			 System.out.println("학점은 : A");
			
		}else if(x >= 80 && x < 90) {
			
			System.out.println("학점은 : B");
			
		}else if(x >= 70 && x < 80) {
			
			System.out.println("학점은 : C");
			
		}else {
		System.out.println("시험 개망함");
		}

	}
	
}