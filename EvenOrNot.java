package JavaProgram;

import java.util.Scanner;

public class EvenOrNot {
	public void even(int a) {
		if(a%2==0) {
			System.out.println(a+" is a even number.");
		}
		else
			System.out.println(a+" is a odd number.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		EvenOrNot e =new EvenOrNot();
		e.even(a);

	}

}
