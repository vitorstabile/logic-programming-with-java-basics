package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		/* ps.addValue("Maria"); */ // This is not allow anymore. This is type safety

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first(); // Isn't necessary the casting
		System.out.println("First: " + x);

		sc.close();
	}
}
