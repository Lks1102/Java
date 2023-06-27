package Test3;

interface Buyer {
	public void buy();
}

interface Sellr {
	public void sell();
}

class Customers implements Buyer, Sellr {
	
	public void sell() {
		System.out.println("판매");
	}
	
	public void buy() {
		System.out.println("구매");
	}
}
public class Test10 {
	 public static void main(String[] args) {
		Buyer buyer = new Customers();
		Sellr sellr = new Customers();
		
		buyer.buy();
		sellr.sell();
	}
}
