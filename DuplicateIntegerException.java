package JavaTopics;

import java.util.Scanner;

public class DuplicateIntegerException {
	
	static void findDuplicate(int a[]) throws Exception {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					throw new Exception("Duplicate found");
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much input you want: ");
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter value "+(i+1)+" : ");
			a[i]=sc.nextInt();
		}
		
		findDuplicate(a);
		
		

	}

}
