package TestBook_ch_8;

interface Remocon {
	public void powerOn();
}

class TV implements Remocon{

	@Override
	public void powerOn() {
		System.out.println("Tv를 켯습니다.");
	}
	
}

public class Test_5 {
	public static void main(String[] args) {
		
		Remocon r = new TV();
		r.powerOn();
		
	}
}
