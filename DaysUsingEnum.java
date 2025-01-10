package JavaTopics;

import java.time.DayOfWeek;
import java.time.LocalDate;



public class DaysUsingEnum{
	
	public enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;}

	public static void main(String[] args) {
		
		LocalDate obj=LocalDate.now();
		DayOfWeek currentDay = obj.getDayOfWeek();
		
		Days d= Days.valueOf(currentDay.name());
		System.out.println("Today day is "+d);

	}

}
