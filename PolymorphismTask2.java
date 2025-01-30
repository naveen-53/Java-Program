package OOPs;

class Employee1{
	
	public int salary() {
		return 0;
	}
}
class Manager1 extends Employee1{
	private int salary;
	Manager1(int s){
		this.salary=s;
	}
	public int salary() {
		return salary;
	}
}
class Programmer1 extends Employee1{
	private int salary;
	Programmer1(int s){
		this.salary=s;
	}
	public int salary() {
		return salary;
	}
}
public class PolymorphismTask2 {
	public static void main(String[] args) {
		Employee1 e1 = new Manager1(100000);
		Employee1 e2 = new Programmer1(80000);
		
		System.out.println("Manager Salary is "+e1.salary());
		System.out.println("programmer Salary is "+e2.salary());

	}

}
