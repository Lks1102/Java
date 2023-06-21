package Sub05;

public class Sedan extends Car{

	private int cc;
	
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
		
	}
	public void speedTurbo() {
		// private에서 protected로 접근권한 변경.
		// 변경해줘야 자식클래스에서 부모클래스 참조가 가능.
		this.speed += 20;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + this.cc + "cc");
	}
	
}
