package JavaProgram;

import java.util.Scanner;

public class EligibleVoter {
	
	public void vote(String str, int age) {
		
		if(str=="indian") {
			if(age>=18) {
				System.out.println("You are eligible for vote.");
			}
			else
				System.out.println("You are not eligible for vote. ");
		}
		else
			System.out.println("You are not eligible for vote. ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Nationality(in small letters): ");
		String str=sc.nextLine();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();		
		EligibleVoter ev =new EligibleVoter();
		ev.vote(str, age);
		
	}

}
