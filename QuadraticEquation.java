package Test;

import java.util.Scanner;

public class QuadraticEquation {
	public void quadraticEquationMethod(double a, double b, double c) {
		double d = (b*b)-(4*a*c);
		if(d>0) {
			double x1=(-b+Math.sqrt(d))/2*a;
			double x2=(-b-Math.sqrt(d))/2*a;
			System.out.println("The roots are "+x1+"and "+x2);
		}
		else if(d==0) {
			double x3=-b/(2*a);
			double x4=-b/(2*a);
			System.out.println("The roots are "+x3+"and "+x4);
		}
		else {
			double realPart =-b/(2*a);
			double imaginaryPart = (Math.sqrt(-d))/(2*a);
			System.out.println("The roots are "+realPart+"+"+imaginaryPart+"i and "+realPart+"-"+imaginaryPart+"i");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		double a =sc.nextDouble();
		System.out.println("Enter b : ");
		double b =sc.nextDouble();
		System.out.println("Enter c : ");
		double c =sc.nextDouble();
		QuadraticEquation q = new QuadraticEquation();
		q.quadraticEquationMethod(a, b, c);
		
		sc.close();
	}

}
