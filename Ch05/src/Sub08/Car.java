package Sub08;

public abstract class Car {

	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	
	
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	
	
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("현재 속도 : " + speed);
	}
	
}
