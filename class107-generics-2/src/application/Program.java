package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		ps.addValue("Maria"); // This is a problem, because you add integer in the list, and now you will add a string. This is not type safety. This will make a run time error
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = (Integer) ps.first(); // When you work with object, you have to make casting.
		System.out.println("First: " + x);

		sc.close();
	}
}
