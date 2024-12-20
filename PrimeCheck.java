package JavaProgram;

import java.util.Scanner;

public class PrimeCheck {
		public void checkPrime(int n) {
			int temp=0;
			if(n==0 || n==1) {  System.out.println(n+" is not a prime number.");  }
			else
				for(int i=2;i<n;i++) {
					if(n%i==0) { temp++; break; }	
				}
			if(temp==0) {  System.out.println(n+" is not a prime number.");  }
			else    System.out.println(n+" is a prime number.");	
		}
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n= sc.nextInt();
			PrimeCheck p =new PrimeCheck();
			p.checkPrime(n);
			
			sc.close();

		}


}
