import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, i, x, sum;

		System.out.print("How many numbers will be enter? ");
		N = sc.nextInt();

		sum = 0;
		for (i = 1; i <= N; i++) {
			System.out.print("Enter a number: ");
			x = sc.nextInt();
			sum = sum + x;
		}
		
		System.out.println("SUM = " + sum);
		
		sc.close();

	}

}
