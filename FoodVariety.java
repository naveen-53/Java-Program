package JavaProgram;

import java.util.Scanner;

public class FoodVariety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.veg\t 2.Nonveg");
		System.out.println("Enter the food veg or nonveg : ");
		String str=sc.next();
		switch(str){
		case "veg" : System.out.println("1.Sambar Rice\t2.Curd Rice\t3.Veg Fried Rice\t4.Veg Biriyani\t5.Mushroom Biriyani");
		break;
		
		case "Nonveg":System.out.println("1.Prawn Fried Rice\t2.Egg Fried Rice\t3.Chicken Fried Rice\t4.Chicken Biriyani\t5.Mutton Biriyani");
		break;
		
		default:
			System.out.println("Invalid data");
		}
		

	}

}
