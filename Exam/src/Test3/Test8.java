package Test3;
/*
 * 날짜 : 2023/06/23
 * 이름 : 이규석
 * 내용 : 다형성 연습문제
 */
class Product {
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
}

class Television extends Product {
	
	public Television(String category, int price) {
		super(category, price);
		
	}
	
	@Override
	public void info() {
		System.out.println("분류 : " + category);
		System.out.println("가격 : " + price);
	}
}

class Computer extends Product {
	
	public Computer(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("분류 : " + category);
		System.out.println("가격 : " + price);
	}
}

public class Test8 {
	public static void main(String[] args) {
	
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}
}
