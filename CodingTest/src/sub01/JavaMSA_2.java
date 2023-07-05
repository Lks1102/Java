package sub01;

public class JavaMSA_2 {
	public static void main(String[] args) {
		
		System.out.println("문제출력");
		for (int i = 1; i <= 4; i++) {

		    for (int j = 4; j > i; j--) {
		        System.out.print("☆");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("★");
		    }
		    for (int j = 4; j > i; j--) {
		        System.out.print("☆");
		    }
		    
		    System.out.println();
		    
		}
	}
}
