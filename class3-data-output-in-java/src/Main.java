import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Good Morning");
		System.out.print("Good Night");
		
		System.out.println();
		
		System.out.println("Good Morning");
		System.out.println("Good Night");

		int x, y;
		x = 10;
		y = 20;
		System.out.println(x);
		System.out.println(y);
		
		double z;
		z = 2.3456;
		System.out.println(String.format("%.2f", z));
		
		int age;
		double salary;
		String name;
		char genre;
		
		age = 32;
		salary = 4560.9;
		name = "Maria Silva";
		genre = 'F';
		
		System.out.println("The employee " + name +
		", genre " + genre + ", earn " +
		String.format("%.2f", salary) + " and have " +
		age + " years old");
		
	}

}
