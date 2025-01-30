package OOPs;

class Vehicle2{
	public void startEngines() {
		System.out.println("Engine starts...");
	}
	public void stopEngines() {
		System.out.println("Engine stops...");
	}
}

class Car2 extends Vehicle2{
	public void startEngines() {
		System.out.println("Car's Engine starts...");
	}
	public void stopEngines() {
		System.out.println("Car's Engine stops...");
	}
}

class MotorCycle2 extends Vehicle2{
	public void startEngines() {
		System.out.println("MotorCycle's Engine starts...");
	}
	public void stopEngines() {
		System.out.println("MotorCycle's Engine stops...");
	}
}

public class PolymorphismTask3 {
	public static void main(String[] args) {
		Vehicle2 v1 = new Car2();
		Vehicle2 v2 = new MotorCycle2();
		v1.startEngines();
		v2.startEngines();
		v1.stopEngines();
		v2.stopEngines();
	}
}
