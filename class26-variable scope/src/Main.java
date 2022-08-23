import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount = 0; // you have to declare the variable out of the if scope and initialize her. 
		
		if (price > 100.0) {
			discount = price * 0.1;
		}
		
		System.out.println(discount);

		sc.close();
		
	}

}
