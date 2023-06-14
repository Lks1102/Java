package sub4;
/*
 * 날짜 : 2023/06/14
 * 이름 : 이규석
 * 내용 : Java 반복문 While 실습하기
 */
public class WhileTest {

	public static void main(String[] args) {
		
		//1~10까지 합
		
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
 		System.out.println(sum);
 		
 		System.out.println("--------------");
		//do while
 		
 		int tot = 0;
 		int i = 1;
 		
 		do {
 			if(i % 2 == 0) {
 				tot += i;
 			}
 				i++;
 				
 		}while(i <= 10);
 	
 		System.out.println("짝수의 합 = " + tot);
 		
 		System.out.println("--------------");
		//break
 		int num = 1;
 		
 		while(true) {
 			if (num % 5 == 0 && num % 7 == 0) {
 				break;
 			}
 		
 			num++;
 		}
 		
 		System.out.println("5와 7의 최소공배수 = " + num);
 		System.out.println("--------------");
 		
 		//continue
		
 		int total = 0;
 		int j = 0;
 		
 		while(j <= 10) {
 			
 			j++;
 			
 			
 			if(j % 2 == 1) {
 				continue;
 			}
 			total += j;
 		}
 		System.out.println("total = " + total);				
	}
}