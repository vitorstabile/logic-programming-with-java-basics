package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		n = sc.nextInt();
		
		Product [] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int p = 0; p < vect.length; p++) {
			sum += vect[p].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();
		
	}

}
