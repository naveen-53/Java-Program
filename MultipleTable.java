package JavaProgram;

import java.util.Scanner;

public class MultipleTable {
	void table(int n) {
		int i=1;
		while(i<=16) {
			System.out.println(i+" x "+n+" = "+(i*n));
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter which table you want:");
		int n=sc.nextInt();
		MultipleTable mt = new MultipleTable();
		mt.table(n);

	}

}
