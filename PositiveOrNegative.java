package Test;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public void checkPositive(int a) {
		if(a>0) {
			System.out.println("Number is Positive ");
		}
		else
			System.out.println("Number is Negative ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a =sc.nextInt();
		PositiveOrNegative p = new PositiveOrNegative();
		p.checkPositive(a);
		
		sc.close();
	}

}
