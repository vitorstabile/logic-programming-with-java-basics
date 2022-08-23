<h1 align="center"> Logic Programming with Java </h1>

# Content

1. [Chapter 1: The Java Language](#chapter1)
    - [Chapter 1 - Part 1: First Program in Java](#chapter1part1)
    - [Chapter 1 - Part 2: Variables Types in Java](#chapter1part2)
    - [Chapter 1 - Part 3: Data Output in Java](#chapter1part3)
    - [Chapter 1 - Part 4: Data Processing in Java](#chapter1part4)
    - [Chapter 1 - Part 5: Data Casting in Java](#chapter1part5)
    - [Chapter 1 - Part 6: Data Input in Java](#chapter1part6)
    - [Chapter 1 - Part 7: Conditional Statement in Java](#chapter1part7)
    - [Chapter 1 - Part 8: While Statement in Java](#chapter1part8)
    - [Chapter 1 - Part 9: For Statement in Java](#chapter1part9)
    - [Chapter 1 - Part 10: Vectors in Java](#chapter1part10)
    - [Chapter 1 - Part 11: Matrix in Java](#chapter1part11)
2. [Chapter 2: Object Oriented](#chapter2)
    - [Chapter 2 - Part 1: Abstraction](#chapter2part1)
    - [Chapter 2 - Part 2: Encapsulation](#chapter2part2)
    - [Chapter 2 - Part 3: Inheritance](#chapter2part3)
    - [Chapter 2 - Part 4: Polymorphism](#chapter2part4)
  
## <a name="chapter1"></a>Chapter 1: The Java Language

#### <a name="chapter1part1"></a>Chapter 1 - Part 1: First Program in Java

```java

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");

	}

}

```

#### <a name="chapter1part2"></a>Chapter 1 - Part 2: Variables Types in Java

```java

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int age;
		double salary, height;
		char genre;
		String name;
		
		age = 20;
		salary = 5800.5;
		height = 1.63;
		genre = 'F';
		name = "Maria Silva";
		
		System.out.println("AGE = " + age);
		System.out.println("SALARY = " + String.format("%.2f", salary));
		System.out.println("HEIGHT = " + String.format("%.2f", height));
		System.out.println("GENRE = " + genre);
		System.out.println("NAME = " + name);

	}

}

```

#### <a name="chapter1part3"></a>Chapter 1 - Part 3: Data Output in Java

```java

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Good Morning");
		System.out.print("Good Night");
		
		System.out.println();
		
		System.out.println("Good Morning");
		System.out.println("Good Night");

		int x, y;
		x = 10;
		y = 20;
		System.out.println(x);
		System.out.println(y);
		
		double z;
		z = 2.3456;
		System.out.println(String.format("%.2f", z));
		
		int age;
		double salary;
		String name;
		char genre;
		
		age = 32;
		salary = 4560.9;
		name = "Maria Silva";
		genre = 'F';
		
		System.out.println("The employee " + name +
		", genre " + genre + ", earn " +
		String.format("%.2f", salary) + " and have " +
		age + " years old");
		
	}

}

```

#### <a name="chapter1part4"></a>Chapter 1 - Part 4: Data Processing in Java

```java

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

```

#### <a name="chapter1part5"></a>Chapter 1 - Part 5: Data Casting in Java

```java

public class Main {

	public static void main(String[] args) {
		
		double a;
		int b;
		a = 5.0;
		b = (int) a;
		System.out.println(b);

	}

}

```

#### <a name="chapter1part6"></a>Chapter 1 - Part 6: Data Input in Java

```java

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary1, salary2;
		String name1, name2;
		int age;
		char genre;
		
		System.out.print("Name of the first person: ");
		name1 = sc.nextLine();
		System.out.print("Salary of the first person: ");
		salary1 = sc.nextDouble();
		
		System.out.print("Name of the second person: ");
		sc.nextLine(); // ------------- buffer cleaning
		name2 = sc.nextLine();
		System.out.print("Salary of the second person: ");
		salary2 = sc.nextDouble();
		
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Genre (F/M): ");
		genre = sc.next().charAt(0);
		
		System.out.println("Name 1: " + name1);
		System.out.println("Salary 1: " + String.format("%.2f", salary1));
		System.out.println("Name 2: " + name2);
		System.out.println("Salary 2: " + String.format("%.2f", salary2));
		System.out.println("Age: " + age);
		System.out.println("Genre: " + genre);
		
		sc.close();

	}

}

```

#### <a name="chapter1part7"></a>Chapter 1 - Part 7: Conditional Statement in Java

```java

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

```

#### <a name="chapter1part8"></a>Chapter 1 - Part 8: While Statement in Java

```java

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

```

#### <a name="chapter1part9"></a>Chapter 1 - Part 9: For Statement in Java

```java

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

```

#### <a name="chapter1part10"></a>Chapter 1 - Part 10: Vectors in Java

```java

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

```

#### <a name="chapter1part11"></a>Chapter 1 - Part 11: Matrix in Java

```java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("How many rows the matrix will be? ");
		M = sc.nextInt();
		System.out.print("How many columns the matrix will be? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Element [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nTyped Matrix:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");	
			}
			System.out.println();
		}
		
		sc.close();
	}

}

```
## <a name="chapter2"></a>Chapter 2: Object Oriented

#### <a name="chapter2part1"></a>Chapter 2 - Part 1: Abstraction

How it represents a real object in our system. It must have identity (Class) given by properties (attributes) and methods (functions).

o Class: Structured type that can contain members - Representation of an entity (Product, Customer), service (ProductService, CustomerService), drivers (ProductController), utilities (calculator) and others (views, repositories).
o Attributes (Data or Fields - Ex: Customer has attribute name, email, cpf and etc.)
o Methods (Class functions and operations - Ex: Consult email, consult cpf, change cpf)

• A class can also have:
o Constructors (Special class operation, performed at instantiation of the class. Used to start attribute values ​​or to force the object to receive data or dependency on its instantiation (Dependency injection))
o Overload of constructors or methods (Esoecify more than one constructor or method in the class)
Encapsulation (Getters and Setters)
o Inheritance (from whom this class inherits)
Polymorphism (A class has several forms or functions)

• Object: They are the instance of the class or instance of the type - Ex: Product p1, Client customer1
• Class: It is the definition of the type (Customer Class, Product Class)

• Instantiation: When we instantiate primitive variables (double, int, String ...) it is instantiated in the memory stack. When the command New in Objects, Arrays and Lists is communicated, the dynamic location of memory occurs, where the object is allocated in another area of memory, called Heap and the object will point to the memory address.

• Advantages of object orientation:
o Reuse of the code and delegation of responsibilities

#### <a name="chapter2part2"></a>Chapter 2 - Part 2: Encapsulation

Adds security to an object-oriented application, as it hides class properties.

o An object must not expose any attributes (use of access modifiers - private, protected ...)
o Class attributes are usually accessed by special methods (Getters and Setters), avoiding direct access to the object's property.
o Analogy with a television: When you click on the call button, we do not know what happens internally on the TV. We can say that the methods that connect the TV are encapsulated.

#### <a name="chapter2part3"></a>Chapter 2 - Part 3: Inheritance

Type of association between classes that allows a class to inherit all data and behavior from another

o Can be used for code reuse
o Used for polymorphism - A class has several uses
The whole class java me, inherits from Object (Warper Classes)

#### <a name="chapter2part4"></a>Chapter 2 - Part 4: Polymorphism

A feature that allows variables of the same more generic type to be able to point to objects of different specific types, thus having different behaviors according to each specific type. In some cases, we must perform the upcasting or dowcasting of the object.

<!-- URL's -->
