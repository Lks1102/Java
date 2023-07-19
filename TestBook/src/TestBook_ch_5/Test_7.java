package TestBook_ch_5;

import java.util.Iterator;

public class Test_7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };

		int maxvalue = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maxvalue) {
				maxvalue = array[i];
			}
		}
		System.out.println(maxvalue);
	}
}


