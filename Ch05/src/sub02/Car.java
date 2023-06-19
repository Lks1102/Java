package sub02;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이규석
 * 내용 : Class의 필드(속성)는 무조건 private
 * Method는 캡슐화의 대상이 아니다. 외부에서 메소드를 활용해야하기 때문.
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)을 은닉하는 특성
 * - 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 * - private 속성의 초기화를 위해 생성자(Constructor)정의
 * - 은닉된 정보의 안전한 사용을 위해 getter, setter 제공
 * 
 */
public class Car {
	
	//필드(속성)
	private String name;
	private String color;
	private int speed;
	
	//생성자 (클래스 이름과 같은 메서드) : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int Speed) {
		
		this.name = name;
		this.color = color;
		this.speed = 0;
	}
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
	
	//Getter, Setter = 필요에 따라 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
