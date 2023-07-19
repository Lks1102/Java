package TestBook_ch_4;
// 2번
public class Test_2 {
	public static void main(String[] args) {
		
		String gread = "B";
		
		int score = switch (gread) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 -20;
			yield result;
		}
		default -> 60;
		};
		
		System.out.println(score);
		
	}
}
