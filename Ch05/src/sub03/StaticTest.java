package sub03;
/*
 * 날짜 : 2023/06/20
 * 이름 : 이규석
 * 내용 : 클래스 변수, 클래스 메서드 실습
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 * -static을 선언한 변수, 메서드로 Method Area에 생성
 * -별도의 객체생성 new를 하지 않고 클래스 타입으로 참조
 * -객체(인스턴스)들 간의 공유 목적으로 클래스변수, 클래스메서드 사용
 * 
 * 
 * 싱글톤 객체(Singleton)
 * -static을 활용한 싱글톤객체는 오직 하나의 인스턴스로 메모리에 존재
 * -싱글톤은 객체를 사용해서 메모리 절약과 성능 향상을 기대
 * 
 */


class increment {
	
	private int num1;
	public static int num2;
	
	public increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}		
	
}

public class StaticTest {

	public static void main(String[] args) {
		
		
		// increment 실습
		increment inc1 = new increment();
		increment inc2 = new increment();
		increment inc3 = new increment();
						
		
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반떼", "검정색", 20);
		Car grande = new Car("그랜져", "남색", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		
		//클래스변수는 디버깅에 표시 안됨.
		
		//클래스 변수로 참조
		System.out.println("전체 차량수 : " + Car.count);
				
		//클래스 메서드 호출
		System.out.println("현재 차량수 : " + Car.getCount());
		
		//싱글톤 객체 실습
		
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		
		System.out.println("re1 : " + result1);
		System.out.println("re2 : " + result2);
	}
}
