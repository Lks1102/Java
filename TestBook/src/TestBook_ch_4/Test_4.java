package TestBook_ch_4;

import java.util.Random;

public class Test_4 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		while (true) {
			int x = random.nextInt(6)+1;
			int y = random.nextInt(6)+1;
			
			System.out.printf("(%d, %d)%n", x, y);
			
			int tot = x + y;
			
			if (tot == 5) {
				break;
			}
			
		}
	}
}
