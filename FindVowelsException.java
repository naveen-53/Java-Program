package JavaTopics;

import java.util.Scanner;

public class FindVowelsException {
	
	static void findVowels(String s) throws Exception {
		char[] str=s.toCharArray();
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U') {
				count++;
			}
		}
		if(count==0) {
			throw new Exception("There is no vowels");
		}
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s=sc.next();
		
		findVowels(s);
		
		sc.close();
		
	}

}
