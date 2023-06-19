package sub01;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이규석
 * 내용 : Java Class 실습
 * 
 * 클래스와 객체
 * - class는 객체를 생성하는 구조체, 속성(필드,멤버변수)과 기능(멤버메서드)으로 설계.
 * - 객체(Object)는 클래스의 실제 인스턴스(instance), new 연산으로 생성
 * 
 */

public class ClassTest {
	public static void main(String[] args) {
		
		
		//객체(Object)
		Car sonata = new Car();
		
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 선언, 생성, 초기화
		Car avante; // 선언
		avante = new Car(); //생성
		avante.name = "아반테"; 
		avante.color = "검정";
		avante.speed = 0;
		
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
	
		//Account 생성
		
		Account KB = new Account();
		
		KB.bank = "국민은행";
		KB.id = "101-111-111";
		KB.name = "입금주";
		KB.balance = 10000;
		
		KB.deposit(40000);
		KB.withdraw(30000);
		KB.show();

		Account wr = new Account();
		
		
		wr.bank = "우리은행";
		wr.id = "111-222-333";
		wr.name = "김춘추";
		wr.balance = 1000;
		
		wr.deposit(39000);
		wr.withdraw(7000);
		wr.show();

	}
		
	
}
