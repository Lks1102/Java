package Test;

public class New2 {
	public static void main(String[] args) {
		String[][][] mbti = {{{"E","I"},{"S","N"}},
							 {{"T","F"},{"J","P"}}};
		
		
		
		System.out.println();
		
		for(int a = 0; a < mbti.length; a++) {
			for(int b = 0; b < mbti[a].length; b++) {
				for(int c = 1; c < mbti[a][b].length; c++) {
					System.out.print(mbti[a][b][c]);
				}
			}
		}
	}
}
