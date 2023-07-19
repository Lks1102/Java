package TestBook_ch_4;

public class Test_5 {
	public static void main(String[] args) {
		
		int tg = 60;
		
		for(int x = 1; x <= 10; x++) {
			
			for(int y = 1; y <=10; y++) {
				
				if(4*x + 5*y == tg) {
					
					System.out.printf("(%d, %d)", x, y);
					
				}
			}
		}
	}
}
