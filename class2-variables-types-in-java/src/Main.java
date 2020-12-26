import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int age;
		double salary, height;
		char genre;
		String name;
		
		age = 20;
		salary = 5800.5;
		height = 1.63;
		genre = 'F';
		name = "Maria Silva";
		
		System.out.println("AGE = " + age);
		System.out.println("SALARY = " + String.format("%.2f", salary));
		System.out.println("HEIGHT = " + String.format("%.2f", height));
		System.out.println("GENRE = " + genre);
		System.out.println("NAME = " + name);

	}

}
