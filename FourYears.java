package JavaProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FourYears {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year in this format (dd/mm/yyyy)");
		String str =sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date d = sdf.parse(str);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.YEAR, 4);
			System.out.println("Input Date: "+sdf.format(c.getTime()));
		}
		catch(ParseException e) {
			System.out.println("Invalid Data ");
		}
		sc.close();

	}

}
