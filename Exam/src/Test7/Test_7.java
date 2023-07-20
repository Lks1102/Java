package Test7;

interface Player {
	public abstract void play();
}

class BaseBallPlayer implements Player {
	public void play() {
		System.out.println("야구를 합니다.");
	}
}

class FootballPlayer implements Player {
	public void play() {
		System.out.println("축구를 합니다.");
	}
}

public class Test_7 {
	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootballPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
