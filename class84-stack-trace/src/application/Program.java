package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of Program");

	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next(); //this will print the stack of the exceptions
			/* Ex:
			 java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 1
					at application.Program.method2(Program.java:31)
					at application.Program.method1(Program.java:19)
					at application.Program.main(Program.java:10)
			 */
		}
		catch (InputMismatchException e) {
			System.out.println("Intup error");
		}

		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
