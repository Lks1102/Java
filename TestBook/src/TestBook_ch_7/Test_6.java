package TestBook_ch_7;

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}


class Child extends Parent {
	public int studentNo;
	
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
}

public class Test_6 {
	public static void main(String[] args) {
		
	}
}
