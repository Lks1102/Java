package sub01;

// Car Class 정의
public class Car {
	
	//필드(속성)
	//변수 선언
	
	String name;
	String color;
	int speed;
	
	
	//메서드(기능)
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
