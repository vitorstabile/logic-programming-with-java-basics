import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.print("How many numbers will be enter? ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("\nTyped Numbers:");
		for (i = 0; i < N; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		sc.close();

	}

}
