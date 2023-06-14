package sub3;
/*
 * 날짜 : 2023-06-13
 * 이름 : 이규석
 * 내용 : Java 연산자 실습
 */
/*
 * Operator(연산자)
 * 변수를 처리하기 위한 연산식
 * 산술, 복합대입, 비교, 논리연산등을 수행
 * 
 */
public class OperatorTest {
	public static void main(String[] args) {
		
		//산술 연산자
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3; //% = 나머지를 구하는 연산자
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		System.out.println("------------------");
		
		//증감 연산자
		
		int num = 0;
		// 선언만 하고 끝나는 경우가 있음.
		// 값을 초기화 하는게 더 좋음.
		num++; //연산자 위치에 따라 차이 존재
		++num;
		System.out.println("num : " + num);
		
		num--;
		--num;
		System.out.println("num : " + num);
		
		System.out.println("-------------------");
				
		//복합대입 연산자
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		n1 += 1; // n1 = n1 + 1
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		System.out.println("----------------");
		
		//비교 연산자
		
		int var1 = 1;
		int var2 = 2;
		
		boolean re1 = var1 > var2; 
		boolean re2 = var1 < var2;
		boolean re3 = var1 >= var2;
		boolean re4 = var1 <= var2;
		boolean re5 = var1 == var2;
		boolean re6 = var1 != var2;
		
		System.out.println("re1 : " + re1);
		System.out.println("re2 : " + re2);
		System.out.println("re3 : " + re3);
		System.out.println("re4 : " + re4);
		System.out.println("re5 : " + re5);
		System.out.println("re6 : " + re6);
		
		System.out.println("-----------------");
		
		//논리 연산자
		
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3);
		boolean res2 = (var3 > 2) && (var4 > 3);
		boolean res3 = (var3 > 3) || (var4 > 3);
		boolean res4 = (var3 > 3) || (var4 > 5);
		boolean res5 = !(var3 > var4);
		
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		
		System.out.println("----------------");
	}
}
