import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int minutos;
		
		valor = 50.00;
		
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			valor += (minutos - 100)*2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", valor);
		
		sc.close();


	}

}
