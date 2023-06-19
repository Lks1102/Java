package re;

public class membaer {

	private String name;
	private String hp;
	private int age;
	
	public membaer(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = 0;
		
	}
	
	
	public void ageUp(int age) {
		this.age += age;		
	}
	public void ageDown(int age) {
		this.age -= age;
	}
	
	public void show() {
		System.out.println("--------");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.hp);
		System.out.println("나이 : " + this.age);
		System.out.println("--------");
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
