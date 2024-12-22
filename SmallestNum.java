package JavaProgram;

import java.util.Scanner;

public class SmallestNum {
	
	void smallnum(int a,int b,int c) {
		if(a<b && a<c) { 
			System.out.println(a+" is the smallest Number.");
		}
		else if(b<a && b<c) {
			System.out.println(b+" is the smallest Number.");
		}
		else
			System.out.println(c+" is the smallest Number.");

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number 1 :");
		int a=sc.nextInt();
		System.out.println("Enter Number 2 :");
		int b=sc.nextInt();
		System.out.println("Enter Number 3 :");
		int c=sc.nextInt();
		SmallestNum sm=new SmallestNum();
		sm.smallnum(a, b, c);
		
		sc.close();
	}
		
}
