package DataStructure;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter the key: ");
		int n=in.nextInt();                           // 8
		
		int start=0, end=a.length-1, flag=0;
		
		
		while(start<=end) {                                 // 0<8                 5<8          6<8
			int mid=(start+end)/2;                          // mid=4               mid=6        mid=7
			if(a[mid]==n) {                                 //   5==8              7==8         8==8
				System.out.println("found at "+mid);        //                                  found at 7
				flag=1;
				break;
			}
			else if(a[mid]<n) {                             // 5<8                 7<8
				start=mid+1;                                // s = 5               s=6
			}
			else
				end=mid-1;
		}
		if(flag==0)
			System.out.println("element not found");
		
		in.close();

	}

}
