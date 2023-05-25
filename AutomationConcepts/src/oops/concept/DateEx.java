package oops.concept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date d=new Date();
			System.out.println(d.toString());
			
		SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss");
			System.out.println(sd.format(d));
		
	}

}
