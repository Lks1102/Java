package Test3;
/*
 * 날짜 : 2023/06/23
 * 이름 : 이규석
 * 내용 : 추상클래스, 다형성 문제
 */

abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("triangle");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("circle");
	}
}


public class Test9 {
	
	public static void main(String[] args) {
		
		Test9 here = new Test9();
		
		
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		
		
		here.draw(triangle);
		here.draw(circle);
	}
	public void draw(Shape obj) {
		obj.draw();
	}
}
