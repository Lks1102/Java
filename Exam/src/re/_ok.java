package re;

import java.util.Scanner;

public class _ok {
	public static void main(String[] args) {

		int a[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		
		int b = 0;
		int c = 0;
		
		while ( b < 2 && c <= 5 ) {
			
			System.out.print(a[b][c] + " ");
			
			c++;
			
			if ( c == 5 ) {
		
				c = 0 ;
				b++;
				
			}
						
		}		
	}
}