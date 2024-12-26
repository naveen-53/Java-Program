package JavaProgram;

class Employee{
	int salary=50000;

	void work() {
		System.out.println("Employee is Working");
	}
	void getSalary() {
		System.out.println("Salary is "+salary);
	}
}

public class HRManager extends Employee {
	void work() {                                  //method overriding
		System.out.println("HRManager is Working");
	}
	
	void addEmployee() {
		System.out.println("Adding Employee");
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getSalary();                
		e1.work();
		
		Employee e2 = new HRManager();
		e2.getSalary();                  
		e2.work();               //method overriding              
		
		HRManager hr = new HRManager();
		hr.addEmployee();
	
	}

}
