import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int x1, y1;
		x1 = 5;
		y1 = 2 * x1;
		System.out.println(x1);
		System.out.println(y1);
		
		int x2;
		double y2;
		x2 = 5;
		y2 = 2 * x2;
		System.out.println(x2);
		System.out.println(String.format("%.1f", y2));
		
		double b1, b2, h, area;
		b1 = 6.0;
		b2 = 8.0;
		h = 5.0;
		area = (b1 + b2) / 2.0 * h;
		System.out.println(area);
		
		int a, b, result;
		a = 5;
		b = 2;
		result = a / b;
		System.out.println(result);
		

	}

}
