package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n;
		n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i]=sc.nextDouble();
		}
		
		double sum = 0;
		for (int p = 0; p < vect.length; p++) {
			sum += vect[p];
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		
		
		sc.close();

	}

}
