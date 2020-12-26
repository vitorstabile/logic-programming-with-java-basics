import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time;
		System.out.print("Enter a time of day: ");
		time = sc.nextInt();
		
		if (6 <= time && time < 12) {
		System.out.println("Good Morning!");
		}
		else if (12 <= time && time < 18) {
			System.out.println("Good Afternoon!");
			}
		else {
		System.out.println("Good Night!");
		}
		
		sc.close();

	}

}
