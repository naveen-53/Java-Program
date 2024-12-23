package JavaProgram;

import java.util.Scanner;

public class PrimeNumWhile {
	void printPrime(int n) {
		int i=2;
		while(i<n) {
			int j=2,temp=0;
			while(i>j) {        
				if(i%j==0) {
					temp++;
				}
				j++;	
			}
			if(temp==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n=sc.nextInt();
		PrimeNumWhile p= new PrimeNumWhile();
		p.printPrime(n);

	}

}
