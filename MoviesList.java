package JavaProgram;

import java.util.Scanner;

public class MoviesList {
	void listofmovies(int a) {
		switch(a) {
		case 1:
			System.out.println("GOAT, Leo, Beast, Sarkar, .....");
			break;
		case 2 :
			System.out.println("Thunivu, Valimai, Viswasam, Vivegam .....");
			break;
		case 3 :
			System.out.println("Kanguva ,Jai Bhim ,NGK,Soorarai Pottru,....");
			break;
		case 4 :
			System.out.println("Asuran, Raayan, Captain Miller, Maari,.......");
			break;
		default :
			System.out.println("Invalid Data");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Vijay\t\t 2.Ajith\n3.Surya\t\t 4.Dhanush");
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		MoviesList ml = new MoviesList();
		ml.listofmovies(a);
		
		sc.close();
	}

}
