package oops.concept;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
				
	}

}
