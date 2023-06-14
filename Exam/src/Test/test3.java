package Test;
/*
 * 날짜 : 2023/06/13
 * 이름 : 이규석
 * 내용 : 자바 연산자 연습문제
 */
public class test3 {

	public static void main(String[] args) {
	
	int num = 0;
	int result = num++;
	
	result = num++;
	System.out.println("result : " + result);
	
	result = ++num;
	System.out.println("result : " + result);
	
	result = num--;
	System.out.println("result : " + result);
	
	result = --num;
	System.out.println("result : " + result);
	}	
}