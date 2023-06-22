package Sub07;
/*
 * 날짜 : 2023/06/22
 * 이름 : 이규석
 * 내용 : Java 다형성(Polymorphism) 실습
 * 
 * Polymorphism(다형성)
 * - 상속관계에서 부모클래스의 기능 -> 자식클래스에서 다양한 기능
 * -객체의 타입선언을 부모클래스 타입으로 선언.
 * - 다형성을활용해 중복을 줄이고 유연성을 높임.
 * 
 */
public class PolyTest {

	public static void main(String[] args) {
		
		//다형성을 활용한 객체 생성(업캐스팅)
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		//다운캐스팅
		
		System.out.println("---------------------");
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		System.out.println("--------------");
		
		//객체 타입 비교연산 ( instanceof )
		
		if ( a1 instanceof Tiger ) {
			System.out.println("a1 = 타이거");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1 = 이글");
		}else if(a1 instanceof Shark) {
			System.out.println("a1 = 샤크");
		}
		
		// 다형성을 활용한 객체배열
		
		System.out.println("----------------");
		
		Animal arr[] = {tiger, eagle, shark};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
	}
}
