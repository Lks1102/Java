package Sub06;
/*
 * 날짜 : 2023/06/21
 * 이름 : 이규석
 * 내용 : Java_Override 실습
 * 
 *  Override (Method 재정의)
 *  - 부모클래스의 method를 자식클래스에서 재정의 하는 문법
 *  - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성을 구현
 */

class AAA {
	
	public void method1() {
		System.out.println("AAA ::method1....");
	}
	public void method2() {
		System.out.println("AAA ::method2....");
	}
	//Overload
	public void method3() {
		System.out.println("AAA ::method3....");
	}

	
}
class BBB extends AAA {
	
	@Override
	public void method2() {
		System.out.println("BBB ::method2....");
	}
	
	
	//Overload
	public void method3(int a) {
		System.out.println("BBB ::method3....");
	}
	
}
class CCC extends BBB {

	@Override
	public void method1() {
		System.out.println("CCC ::method1....");
	}
	@Override
	public void method2() {
		System.out.println("CCC ::method2....");
	}
	//Overload
	public void method3(int a, int b) {
		System.out.println("CCC ::method3....");
	}
	
}


public class OverrideTest {
	public static void main(String[] args) {
		
		// OVerride Method 호출
		
		CCC c = new CCC();
		c.method1(); // AAA method1 내용에 CCC method1내용을 덮어씌움
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		
		System.out.println("------------");
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
		
		
		
	}
}
