package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(d); // The Calendar class have a operation to convert the specific date.
		cal.add(Calendar.HOUR_OF_DAY, 4); // operation to add a hour
		d = cal.getTime(); // return the date with the new sum
		int minutes = cal.get(Calendar.MINUTE); // extract the minutes
		int month = 1 + cal.get(Calendar.MONTH); // extract the month of the date. You have to increment 1, because january is count as 0.

		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);



	}

}
