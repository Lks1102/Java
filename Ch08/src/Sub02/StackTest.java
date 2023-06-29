package Sub02;

import java.util.Stack;

/*
 * 날짜 : 2023/06/23
 * 이름 : 이규석
 * 내용 : Java Stack 실습
 * 
 *	Stack
 *	- stack은 데이터가 순서대로 쌓이는 구조이며 (LIFO)후입선출이다.
 *	- 변수 선언과 메서드 실행에 사용
 *	
 */

public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
//		System.out.println("Stack pop : " + stack.pop());
//		System.out.println("Stack pop : " + stack.pop());
//		System.out.println("Stack pop : " + stack.pop());
//		System.out.println("Stack pop : " + stack.pop());
//		System.out.println("Stack pop : " + stack.pop());
		
		while(!stack.empty()) {
			System.out.println("Stack pop : " + stack.pop());
		}
		
		
	}

}
