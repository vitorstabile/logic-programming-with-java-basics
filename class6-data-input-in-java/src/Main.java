import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary1, salary2;
		String name1, name2;
		int age;
		char genre;
		
		System.out.print("Name of the first person: ");
		name1 = sc.nextLine();
		System.out.print("Salary of the first person: ");
		salary1 = sc.nextDouble();
		
		System.out.print("Name of the second person: ");
		sc.nextLine(); // ------------- buffer cleaning
		name2 = sc.nextLine();
		System.out.print("Salary of the second person: ");
		salary2 = sc.nextDouble();
		
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Genre (F/M): ");
		genre = sc.next().charAt(0);
		
		System.out.println("Name 1: " + name1);
		System.out.println("Salary 1: " + String.format("%.2f", salary1));
		System.out.println("Name 2: " + name2);
		System.out.println("Salary 2: " + String.format("%.2f", salary2));
		System.out.println("Age: " + age);
		System.out.println("Genre: " + genre);
		
		sc.close();

	}

}
