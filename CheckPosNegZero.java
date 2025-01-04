package Test;

import java.util.Scanner;

public class CheckPosNegZero {
	public void checkPos(float num) {
		if(num==0) {
			System.out.println("Input Value: "+num);
			System.out.println("Zero");
		}else if(num>0) {
			System.out.println("Input Value: "+num);
			System.out.println("positive Number");
			if(Math.abs(num)<1) {
				System.out.println("Small");
			}
			else if(Math.abs(num)>1000000) {
				System.out.println("Large");
			}
		}
		else {
			System.out.println("Input Value: "+num);
			System.out.println("Negative Number");
			if(Math.abs(num)<1) {
				System.out.println("Small");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Number: ");
		float num =sc.nextFloat();
		
		CheckPosNegZero c = new CheckPosNegZero();
		c.checkPos(num);
		
		sc.close();
		

	}

}
