package Test;

import java.util.Scanner;

public class GreatestAmongThree {
	public void greatestamongThree(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("The greatest:"+a);
		}
		else if(b>c && b>a) {
			System.out.println("The greatest:"+b);
		}
		else
			System.out.println("The greatest:"+c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a =sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b =sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int c =sc.nextInt();
		GreatestAmongThree g = new GreatestAmongThree();
		g.greatestamongThree(a, b, c);
		
		sc.close();
	

	}

}
