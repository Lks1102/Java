package Test7;

interface IRunnable {
	public void run();
}

interface IFlyable {
	public void fly();
}

class FlyingCar implements IRunnable, IFlyable {
	public void fly() {
		System.out.println("car fly!");
	}
	
	public void run() {
		System.out.println("car run!");
	}
}

public class Test_8 {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
		car.run();
		car.fly();
	}
}
