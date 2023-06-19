package sub01;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이규석
 * 내용 : Class
 */
public class Account {

	//속성
	String bank;
	String id;
	String name;
	int balance;
		
	//기능 (클래스가 한개일경우, 매개변수가 같은 이름이 없는경우 this. 생략가능)
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("------------");
	}

}
