package OOPs;

class Vehicle1{
	public void speedUp() {
		System.out.println("Speeding Up");
	}
}
class Car extends Vehicle1{
	public void speedUp() {
		System.out.println("Car is Speeding Up");
	}
}
class Bicycle1 extends Vehicle1{
	public void speedUp() {
		System.out.println("Bicycle is Speeding Up");
	}
}
public class PolymorphismTask1 {

	public static void main(String[] args) {
		
		Vehicle1 v1 = new Car();
		Vehicle1 v2 = new Bicycle1();
		v1.speedUp();
		v2.speedUp();

	}

}
