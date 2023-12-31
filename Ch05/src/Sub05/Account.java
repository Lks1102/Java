package Sub05;

public class Account {

	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("---------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금자명 : " + this.name);
		System.out.println("계좌잔액 : " + this.balance);
		System.out.println("---------");
	}
	
}
