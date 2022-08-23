package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // format to print
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");// format to print with hours
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date(); // Give the date now
		Date x2 = new Date(System.currentTimeMillis()); // Give the date in miliseconds. Use Long
		Date x3 = new Date(0L); // The instant in UTC GMT Date 01/01/1970 in miliseconds. Use Long
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); // This is 3 hours form GMT because of Brasilia local time
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // This date is in UTC (Z letter) in the machine time. Use GMT in sdf 3
		
		System.out.println("--------------------------- Format Date Pattern Java - UTC - Machine Time");
		System.out.println("y1: "+ y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("--------------------------- Format Date - UTC - Machine Time");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("--------------------------- Format Date - GMT Time");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));

	}

}
