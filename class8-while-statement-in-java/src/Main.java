import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, sum;
		
		sum = 0;
		System.out.print("Enter the first number: ");
		x = sc.nextInt();
		
		while (x != 0) {
			sum = sum + x;
			System.out.print("Enter another number: ");
			x = sc.nextInt();
		}
		
		System.out.println("SUM = " + sum);
		
		sc.close();
	}

}
