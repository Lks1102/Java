package TestBook_ch_7;

class Activity {
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}

class MainActivity extends Activity {
	
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가적인 실행 내용");
	}
}


public class Test_11 {
	public static void main(String[] args) {
		MainActivity mA = new MainActivity();
		
		mA.onCreate();
		
	}
}
