package TestBook_ch_6;

public class Test_19 {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("잔액 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("잔액 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("잔액 : " + account.getBalance());
		
		account.setBalance(30000);
		System.out.println("잔액 : " + account.getBalance());
	}
}
