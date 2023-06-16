package re;

public class re01 {
	public static void main(String[] args) {
		
	second();
	System.out.println(second());
	System.out.println();
	four(6);
	System.out.println();
	third();
	
	
	}
	//매개변수 O , return O
	public static int frist(int num1) {
		
		
		int num2 = 0;
		num2 += num1;		
		return num2;
	}
	
	//매개변수  X 리턴값 O
	public static int second() {
		
		int a = 2;
		return a;
	}
	
	//매개변수가 O 리턴값 X
	public static void four(int number) {		
		int a = 2;
		
		a += number;
		
		System.out.println(a);
		
		
	}
	
	//매개변수 X 리턴값 X
	//매개변수가 없고 리턴값이 없으면 메소드 이름만 적기 (Ex : third;)
	
	public static void third() {
		
		System.out.println("hello");
		
	}
	
}
