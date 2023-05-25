package automationscripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDateEx {

	public static void main(String[] args) {
		
	// Write program to read system date and convert that into required format
		Date dt= new Date();
		System.out.println(dt);
		
		DateFormat df= new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss");
		System.out.println(df.format(dt));

	}

}
