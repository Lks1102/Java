package Interface;

public class Taxi implements Meter {

	@Override
	public void start() {
		
		start();
		
	}

	@Override
	public int stop(int distance) {
		stop(distance * 2);		
		return 0;
	}

}
