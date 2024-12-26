package JavaProgram;

class Animal{
	void makeSound() {
		System.out.println("Animal is Barking");
	}
}

public class Cat extends Animal {
	void makeSound() {             //method overriding
		System.out.println("Meow....");
	}

	public static void main(String[] args) {
		
		Animal a = new Cat ();
		a.makeSound();
		
	}

}

