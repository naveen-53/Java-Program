package JavaProgram;

import java.util.Scanner;

public class DivisibleBy2and4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int n=sc.nextInt();
		int i=1;
		while (i<=n) {
			if(i%2==0 && i%4==0) {
				System.out.println(i);
			}
			i++;
			
		}

	}


}
