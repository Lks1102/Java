package Sub01;
/*
 * 날짜 : 2023/06/23
 * 이름 : 이규석
 * 내용 : Java Generic 실습
 * 
 * Generic
 * 	- 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 * 	- Generic 사용으로 클래스를 범용성있게 사용	
 */
public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple a = new Apple("한국",3000);
		Banana b = new Banana("일본",3000);
		
		FruitBox<Apple> applebox = new FruitBox<>();
		applebox.setFruit(a);
		System.out.println(applebox.getFruit());
		
		
		FruitBox<Banana> bananabox = new FruitBox<>();
		bananabox.setFruit(b);
		System.out.println(bananabox.getFruit());
		
	}
}
