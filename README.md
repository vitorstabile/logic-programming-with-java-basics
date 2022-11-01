<h1 align="center"> Java </h1>

# Content

1. [Chapter 1: Programming Concepts](#chapter1)
    - [Chapter 1 - Part 1: Programmer's Career Starts](#chapter1part1)
    - [Chapter 1 - Part 2: Algorithm](#chapter1part2)
    - [Chapter 1 - Part 3: Automation](#chapter1part3)
    - [Chapter 1 - Part 4: Computer Program](#chapter1part4)
    - [Chapter 1 - Part 5: What Does it Take to Make a Computer Program?](#chapter1part5)
    - [Chapter 1 - Part 6: Programming Language](#chapter1part6)
    - [Chapter 1 - Part 7: IDE](#chapter1part7)
    - [Chapter 1 - Part 8: Compilation and Interpretation, Source Code and Object Code, Virtual machine](#chapter1part8)
2. [Chapter 2: Introduction to Java](#chapter2)
    - [Chapter 2 - Part 1: What is Java?](#chapter2part1)
    - [Chapter 2 - Part 2: Understanding Java Versions (LTS)](#chapter2part2)
    - [Chapter 2 - Part 3: JVM](#chapter2part3)
    - [Chapter 2 - Part 4: Compile-time Errors and Runtime Errors](#chapter2part4)
    - [Chapter 2 - Part 5: Structure of a Java Application](#chapter2part5)
    - [Chapter 2 - Part 6: Components of Oracle's Java Platform Products](#chapter2part6)
    - [Chapter 2 - Part 7: First Program in Java](#chapter2part7)
3. [Chapter 3: Sequential Structure](#chapter3)
    - [Chapter 3 - Part 1: Arithmetic Expressions](#chapter3part1)
    - [Chapter 3 - Part 2: Variables](#chapter3part2)
    - [Chapter 3 - Part 3: Data Types in Java](#chapter3part3)
    - [Chapter 3 - Part 4: The Three Basic Operations of a Computer](#chapter3part4)
    - [Chapter 3 - Part 5: Data Output](#chapter3part5)
    - [Chapter 3 - Part 6: Data Processing](#chapter3part6)
    - [Chapter 3 - Part 7: Casting](#chapter3part7)
    - [Chapter 3 - Part 8: Data Input](#chapter3part8)
    - [Chapter 3 - Part 9: Mathematic Functions](#chapter3part9)
4. [Chapter 4: Conditional Structure](#chapter4)
    - [Chapter 4 - Part 1: Conditional Statement in Java](#chapter4part1)
    - [Chapter 4 - Part 2: While Statement in Java](#chapter4part2)
    - [Chapter 4 - Part 3: For Statement in Java](#chapter4part3)
5. [Chapter 5: Data Structure](#chapter5)
    - [Chapter 5 - Part 1: Vectors in Java](#chapter5part1)
    - [Chapter 5 - Part 2: Matrix in Java](#chapter5part2)
6. [Chapter 6: Object Oriented](#chapter6)
    - [Chapter 6 - Part 1: Abstraction](#chapter6part1)
    - [Chapter 6 - Part 2: Encapsulation](#chapter6part2)
    - [Chapter 6 - Part 3: Inheritance](#chapter6part3)
    - [Chapter 6 - Part 4: Polymorphism](#chapter6part4)

## <a name="chapter1"></a>Chapter 1: Programming Concepts
  
#### <a name="chapter1part1"></a>Chapter 1 - Part 1: Programmer's Career Starts

The beginning of any programmer's career starts with solid fundamentals, such as:

1. Programming Logic
2. Algorithms
3. Data Structure (Arrays, Lists)
4. Object Oriented Programming
5. Relational Data Base
6. Systems Analysis and Design

#### <a name="chapter1part2"></a>Chapter 1 - Part 2: Algorithm

Algorithm is a process or set of rules to be followed as problem-solving operations.

Make a cake problem:

A Cake Recipe Algorithm

1. Preheat the oven.
2. Gather the ingredients.
3. Measure out the ingredients.
4. Mix the ingredients to make the batter.
5. Grease a pan.
6. Pour the batter into the pan.
7. Put the pan in the oven.
8. Set a timer.
9. When the timer goes off, take the pan out of the oven.
10. Enjoy!

#### <a name="chapter1part3"></a>Chapter 1 - Part 3: Automation

Consists of using machine (s) to perform the procedure automatically or semi-automatically.

In the cake recipe example, a food mixer can in the step four can be a example of automation.

#### <a name="chapter1part4"></a>Chapter 1 - Part 4: Computer Program

Computer have:

Hardware: Physical Parts (CPU, RAM, GPU, keyboard...)

Software: Logical Part (Program)
    - Operation System
    - Aplications (Spotify, Word, Web Browser)
    - Games
    - Utilities

Conclusion: Computer programs are algorithms executed by the computer. The computer is a machine that automates the execution of
algorithms.
Any algorithm? No. Only computational algorithms: Data processing and Calculation

#### <a name="chapter1part5"></a>Chapter 1 - Part 5: What Does it Take to Make a Computer Program?

To make a computer program, we need:

- A programming language: lexical and syntactic rules for write the program
- An IDE: software to edit and test the program
- A compiler: software for turning source code into code object
- A code generator or virtual machine: software that allows the program to run

#### <a name="chapter1part6"></a>Chapter 1 - Part 6: Programming Language

Programming languages have a lexical rules (orthography) and syntax rules (grammar) to write programs.

- Lexical

    Is about the correct words orthography.
    
    | Example English                                 | Example Programming Language  |
    |:------------------------------------------------|:------------------------------|
    | Dog (Correct)                                   | Main (Correct)                |
    | Dogo (Wrong)                                    | Maim (Wrong)                  |
    
- Syntax

   Is about the correct sentence’s grammar.
   
    | Example English                                 | Example Programming Language       |
    |:------------------------------------------------|:-----------------------------------|
    | He is a Daniel in judgment (Correct)            | x = 2 + y (Correct)                |
    | Daniel is a He in judgment (Wrong)              | x = + 2 y (Wrong)                  |
    

Example of program in Java:

```java
package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        	double x, y, media;
        
		System.out.print("Enter the First Number: ");
        	x = sc.nextDouble(); //input: 2
        	System.out.print("Enter the Second Number: ");
        	y = sc.nextDouble(); //input: 4
        
        	media = (x + y)/2.0;
        
       		System.out.println("Media = " + media);
        	sc.close();
	}
}

/*
Console

----input---
Enter the First Number: 2.0
Enter the First Number: 4.0

----output---
Media = 3.0
*/
```

#### <a name="chapter1part7"></a>Chapter 1 - Part 7: IDE

It is a set of software used to build programs.

Ex:

- C / C ++: Code Blocks
- Java: Eclipse, NetBeans
- C#: Microsoft Visual Studio

Functions of an IDE

- Editing of source code (indentation, autocompletion, highlighting of words, etc.)
- Debugging and testing
- Construction of the final product (build)
- Suggestion of templates
- Assist in various tasks of your project

#### <a name="chapter1part8"></a>Chapter 1 - Part 8: Compilation and Interpretation, Source Code and Object Code, Virtual Machine

**Source Code**: is the code written by the programmer in a programming language

Ex:

```java
package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        	double x, y, media;
        
		System.out.print("Enter the First Number: ");
        	x = sc.nextDouble(); //input: 2
        	System.out.print("Enter the Second Number: ");
        	y = sc.nextDouble(); //input: 4
        
        	media = (x + y)/2.0;
        
       		System.out.println("Media = " + media);
        	sc.close();
	}
}

/*
Console

----input---
Enter the First Number: 2.0
Enter the First Number: 4.0

----output---
Media = 3.0
*/
```
<br>

<div align="center"><img src="img/compilation-interpretation-w1353-h638.png" width=1000 height=500><br><sub>Fig 1 - Compilation and Interpretation Process</sub></div>

<br>

<div align="center"><img src="img/hybrid-w1079-h395.png" width=1300 height=500><br><sub>Fig 2 - Hybrid Process</sub></div>

<br>

- **Compilation**:
	- Program Speed
	- Compiler Assistance Before Execution
	- Disadvantage: Platform dependence of the generated binary code

- **Interpretation**:
	- Flexibility of Maintaining the Application in Production
	- Expressiveness of Language
	- Source Code does not need to be Recompiled to run on different platform
	- Disadvantage: Execution speed compared to compiled languages.

- **Hybrid**:
	- Compiler Assistance Before Execution
	- Source Code does not need to be Recompiled to run on different platform

## <a name="chapter2"></a>Chapter 2: Introduction to Java

#### <a name="chapter2part1"></a>Chapter 2 - Part 1: What is Java?

**Whats is Java?** 

Java is a program language and a developing platform, with libraries (API) and execution environment.

When you need to run a Java Program in a computer, you have to install the execution environment to run the program and the JDK (Java Development Kit) with the libraries and API.

**History of Java**

- Problems solved and reason for its success:
	- Pointers (C and C++) / memory management (garbage collector)
	- Failed portability: writing part of the code when changing of SO
	- Use on miscellaneous devices
	- Costs

- Created by Sun Microsystems in the mid-1990s

- Acquired by Oracle Corporation in 2010

- Java Advantages:
	- Compiled code for bytecode and run on virtual machine (JVM)
	- Portable, safe, robust
	- Runs on various types of devices
	- Dominates the corporate market since the end of the 20th century

**Java Editions**

 - Java ME - Java Micro Edition - embedded and mobile devices - IoT - http://www.oracle.com/technetwork/java/javame
 - Java SE - Java Standard Edition - core - desktop e servers - http://www.oracle.com/technetwork/java/javase
 - Java EE - Java Enterprise Edition - corporate applications - http://www.oracle.com/technetwork/java/javaee

**Java SE Documentation**

https://docs.oracle.com/en/java/javase/11/


#### <a name="chapter2part2"></a>Chapter 2 - Part 2: Understanding Java Versions (LTS)

The Standard Edition (SE) of Java, you can see in this link: https://www.oracle.com/java/technologies/javase-downloads.html

It is absolutely crazy to think about keeping several applications or several hundred (thousand?) servers up to date with the newest Java release, especially when 5 have come out in as many years by the end of 2019. That is why the concept of an LTS was established. A Java LTS (long-term support) release is a version of Java that will remain the industry standard for several years. To give you an example of this, Java 8 was released in 2014, it will continue to receive updates until 2020, and extended support will end by 2025. This is a span of almost 10 years for a stable Java release to be considered an industry standard. This gives plenty of OS vendors like Microsoft and Red Hat the time to repackage their releases with Java 8, time for application developers to update their applications to take full advantage of Java 8 features, and time for system administrators to update their data centers with Java 8 before a new version is released. At this time, the only other Java version that is also an LTS version is Java 11, which was released in 2018.

#### <a name="chapter2part3"></a>Chapter 2 - Part 3: JVM

JVM is the Java Virtual Machine to execute Java Programs in your system.

Java take the advantages of compilation and interpretation and create the hybrid interpretation with JVM.

Below, there some of compilation process examples in Java:

<br>

<div align="center"><img src="img/java-compiler-process-w700-h676.png" width=700 height=676><br><sub>Fig 3 - Compilation Process in Java - (<a href='https://medium.com/@PrayagBhakar/lesson-2-behind-the-scenes-4df6a461f31f'>Work by Prayag Bhakar</a>) </sub></div>

<br>

<div align="center"><img src="img/java-compiler-process2-w487-h317.png" width=487 height=317><br><sub>Fig 4 - Compilation Process in Java - (<a href='https://www3.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html'>Work by Chua Hock-Chuan</a>) </sub></div>

<br>

<div align="center"><img src="img/java-compiler-process3-w612-h242.png" width=612 height=242><br><sub>Fig 5 - Compilation Process in Java - (<a href='https://www.w3schools.in/java-tutorial/compile-java-file-using-javac/'>Work by  w3schools</a>) </sub></div>

<br>

The process to execute the bytecode is called JIT (Just in Time) Compilation. Is more faster than interpretation because the compiler revise before the run time, if the bytecode is lexical and syntactical correct.

<br>

<div align="center"><img src="img/java-compiler-process4-w557-h617.png" width=557 height=617><br><sub>Fig 6 - Compilation Process in Java - (<a href='http://javaeesupportpatterns.blogspot.com/2013/07/java-just-in-time-compilation-more-than.html'>Work by javaeesupportpatterns</a>) </sub></div>

<br>

#### <a name="chapter2part4"></a>Chapter 2 - Part 4: Compile-time Errors and Runtime Errors

| Compile-time                                                                                                              | Runtime                                                                                                                              | 
| :------------------------------------------------------------------------------------------------------------------------ | :-----------------------------------------------------------------------------------------------------------------------------------:|
| The compile-time errors are the errors which are produced at the compile-time, and they are detected by the compiler.     | The runtime errors are the errors which are not generated by the compiler and produce an unpredictable result at the execution time. |
| In this case, the compiler prevents the code from execution if it detects an error in the program.]                       | In this case, the compiler does not detect the error, so it cannot prevent the code from the execution.                              |
| It contains the syntax and semantic errors such as missing semicolon at the end of the statement.                         | It contains the errors such as division by zero, determining the square root of a negative number.                                   |

#### <a name="chapter2part5"></a>Chapter 2 - Part 5: Structure of a Java Application

Java is an object-oriented language and your base unit is the class.  Every Code in Java have to be in a class.

The classes is organize in packages and the packages is organize in modules. A Java application is a set of modules with packages.

Bellow, there is a example of a Java application:

<br>

<div align="center"><img src="img/application-structure-in-java-w1449-h810.png" width=1000 height=500><br><sub>Fig 7 - Application Structure in Java Application </sub></div>

<br>

#### <a name="chapter2part6"></a>Chapter 2 - Part 6: Components of Oracle's Java Platform Products

The Java JDK come with some of most used packages to help the developer like awt, beans, io, lang, math, net, nio, sql, util and each package have a class or a interface.

<br>

<div align="center"><img src="img/packages-jdk-w646-h292.png" width=646 height=292><br><sub>Fig 8 -Java Packages - (<a href='http://www.wellnwill.com/tutorial/core-java/package/package'>Work by Well N Will</a>) </sub></div>

<br>

Oracle have a documentation about all his packages: https://docs.oracle.com/javase/8/docs/api/

<br>

<div align="center"><img src="img/packages-jdk2-w788-h483.png" width=788 height=483><br><sub>Fig 9 -Java Packages - (<a href='https://docs.oracle.com/javase/8/docs/technotes/guides/desc_jdk_structure.html'>Work by Oracle</a>) </sub></div>

<br>

One of the most famous used packages is java.util.collections and java.util.map

<br>

<div align="center"><img src="img/packages-jdk4-w1512-h1252.png" width=500 height=400><br><sub>Fig 10 -Java Packages - (<a href='https://ukode.es/colecciones-i-introduccion-y-conceptos-basicos/'>Work by Jose Antonio Simón</a>) </sub></div>

<br>

<div align="center"><img src="img/packages-jdk3-w1720-h693.png" width=700 height=300><br><sub>Fig 11 -Java Packages - (<a href='https://ukode.es/colecciones-i-introduccion-y-conceptos-basicos/'>Work by Jose Antonio Simón</a>) </sub></div>

<br>

<div align="center"><img src="img/packages-jdk5-w854-h715.png" width=854 height=715><br><sub>Fig 12 -Java Packages - (<a href='https://www.javatpoint.com/collections-in-java'>Work by JavaPoint</a>) </sub></div>

<br>

#### <a name="chapter2part7"></a>Chapter 2 - Part 7: First Program in Java

To create your first program in Java, create a class in the srs folder.

Every programm in Java is a class.

Java programs have keywords. Each has a specific meaning and sometimes they need to be used in specific orders.

This keywords are case sensitive - in the code below, public, Public and PUBLIC are different things.

```java
package application;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hello World!"); 

	}
}

/*
Console

----output---
Hello World!
*/
```

In the example above, public,class,void,main,Strings[],args,System.out.println are keywords.

**Defining a acess modifier**: the public is the acess modifier of the class. In this case, the class is public, or open to another class's.

**Defining a class**: The class keyword is used to define a class with the name following the keyword - Program - in this case. In the class, the left and right curly braces is to define the class block. To define a class requires a acess modifer, in this case, public.

**The main method**: Is the entry point for any Java program and is able to start and run the program when we use it.

**The static**: More later

**The void**: Indicate that the method will not return any information.

**The left and right parenthesis ()**: Method declaration mandatory and can optionally include one or more parameters - wich is a way to pass a information to a method

**String[] args**: String[] args means an array of sequence of characters (Strings) that are passed to the "main" function.

**System.out.println("Hello World!")**: Is a method to print in the console that recive a statement.

## <a name="chapter3"></a>Chapter 3: Sequential Structure

#### <a name="chapter3part1"></a>Chapter 3 - Part 1: Arithmetic Expressions

Arithmetic Expressions is when you have a expression and the result of this expression result in a numeric value.

Ex: 4 + 5 = 9

Below, there is the arithmetic expressions operators in Java

| Operator | Name             | Description                              |Example     |
| :-------:| :---------------:|:---------------------------------------: |:---------: |
| +        | Addition         | Adds together two values                 | x + y      |
| -        | Subtraction      | Subtracts one value from another         | x - y      |
| *        | Multiplication   | Multiplies two values                    | x * y      |
| /        | Division         | Divides one value by another             | x / y      |
| %        | Modulus          | Returns the division remainder           | x % y      |
| ++       | Modulus          |	Increases the value of a variable by 1   | ++x        |
| --       | Decrement        | Decreases the value of a variable by 1   | --x        |


#### <a name="chapter3part2"></a>Chapter 3 - Part 2: Variables

Variables are a way to store information in our computer. Variables that we define in a program can be accesed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computers random access memory (RAM).

In programming, a variable is a portion of memory (RAM) used to store data during the execution of the programs.

Declaration of variables

(type) (name) = (initial value);

The initial value to declare a variable can be optional.
	
```java

int idade = 25;
double altura = 1.68;
char sexo = 'F';

```
A variable have:
- Name
- Type
- Value
- Memory RAM Adress

#### <a name="chapter3part3"></a>Chapter 3 - Part 3: Data Types in Java

In Java, we have the 8 primitive data types. Other types are Non-primitive like the diagram below:

<br>

<div align="center"><img src="img/data-types-w8000-h4500.png" width=600 height=350><br><sub>Fig 13 -Java Data Types - (<a href='https://getkt.com/blog/reintroduction-to-java-data-types/'>Work by neotam</a>) </sub></div>

<br>

<div align="center"><img src="img/data-types2-w1920-h1080.jpg" width=600 height=300><br><sub>Fig 14 -Java Data Primitive Types - (<a href='https://getkt.com/blog/reintroduction-to-java-data-types/'>Work by neotam</a>) </sub></div>

<br>

The size of a data (bits) is the number of the values this variable can store: The byte type can store 8 bits. Each bit store 1 or 0.

So: 2x2x2x2x2x2x2x2x2 = 2^8 = 256 possible values (-128 to 127)


To see the range of max and min of a type of variable do:

```java
int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;
System.out.println("Integer Minimum Value = " + myMinIntValue);
System.out.println("Integer Maximum Value = " + myMaxIntValue);

int myMaxIntTest = 2_147_483_647; // another form to express

byte myMinByteValue = Byte.MIN_VALUE;
byte myMaxByteValue = Byte.MAX_VALUE;
System.out.println("Byte Minimum Value = " + myMinByteValue);
System.out.println("Byte Maximum Value = " + myMaxByteValue);

short myMinShortValue = Short.MIN_VALUE;
short myMaxShortValue = Short.MAX_VALUE;
System.out.println("Short Minimum Value = " + myMinShortValue);
System.out.println("Short Maximum Value = " + myMaxShortValue);
        
long myLongValue = 100; // Wrong -> Use L
long myMinLongValue = Long.MIN_VALUE;
long myMaxLongValue = Long.MAX_VALUE;
System.out.println("Long Minimum Value = " + myMinLongValue);
System.out.println("Long Maximum Value = " + myMaxLongValue);
long bigLongLiteralValue = 2_147_483_647_234L;
System.out.println(bigLongLiteralValue);

short bigShortLiteralValue = 32767;

/*

Output

Integer Minimum Value = -2147483648
Integer Maximum Value = 2147483647
Byte Minimum Value = -128
Byte Maximum Value = 127
Short Minimum Value = -32768
Short Maximum Value = 32767
Long Minimum Value = -9223372036854775808
Long Maximum Value = 9223372036854775807
2147483647234
*/
```

If you try to add a value in a Maximun or Minimun Value, will occur a overflow in a Maximun and underflow in Minimun. The Computer will convert the maximun to minimun and vice-versa

```java
int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;
System.out.println("Integer Minimum Value = " + myMinIntValue);
System.out.println("Integer Maximum Value = " + myMaxIntValue);
System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // underflow

/*
Output

Integer Minimum Value = -2147483648
Integer Maximum Value = 2147483647
Busted MAX value = -2147483648
Busted MIN value = 2147483647
*/
```


Wrapper types(Reference Types) provided by java for corresponding Primitive Types

| Primitive Types  | Wrapper types(Reference Types) |
| :--------------: | :-----------------------------:|
| boolean          | Boolean                        | 
| byte             | Byte                           |
| character        | Character                      |
| short            | Short                          |
| int              | Int                            | 
| long             | Long                           |
| float            | Float                          |
| double           | double                         |

**Variables Name -> Camel Case** Ex: myVariable

**Class Name -> Pascal Case** Ex: MyClass

#### <a name="chapter3part4"></a>Chapter 3 - Part 4: The Three Basic Operations of a Computer

The Basic operations of a computer is Input of Data, Processing of Data and the output of the result or data.

The processing is made by the CPU

<br>

<div align="center"><img src="img/basic-operations-computer-w562-h190.gif" width=562 height=190><br><sub>Fig 15 -Basic Operations of a Computer - (<a href='http://cs.sru.edu/~mullins/cpsc100book/module02_introduction/module02-04_introduction.html'>Work by Paul Mullins</a>) </sub></div>

<br>

#### <a name="chapter3part5"></a>Chapter 3 - Part 5: Data Output

The basic comand to output data in java is:

```java
System.out.print(""); // without linebreake

System.out.println(); // witho linebreake
```

To output a float number:

```java
double x  = 10.35784;

System.out.println(x);

System.out.printf("%.2f%n", x); // With two decimals and linebreak -> OBS: use of system locale

System.out.printf("%.4f%n", x); // With four decimals and linebreak -> OBS: use of system locale
```

To consider the decimal separator as a point, BEFORE the Scanner declaration, import java.util.Locale; and use Locale.setDefault(Locale.US);:

```java
// import java.util.Locale;
```

```java
Locale.setDefault(Locale.US);
		
double x  = 10.35784;

System.out.println(x);
```

To concatenate multiple elements into one same write command

%f = float number

%d = int

%s = text

%n = linebreak

```java
double x  = 10.35784;

System.out.println("RESULTADO = " + x + " METROS");

System.out.printf("RESULTADO = %.2f metros%n", x);

String nome = "Maria";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
```

```java
System.out.print("Olá Mundo!");
System.out.println("Bom Dia!");
		
int y = 32;
		
System.out.println(y);
		
double x = 10.35784;
		
System.out.println(x);
		
System.out.printf("%.2f%n", x);
		
System.out.printf("%.4f%n", x);
		
Locale.setDefault(Locale.US);
		
System.out.printf("%.2f%n", x);
		
System.out.printf("%.4f%n", x);
		
System.out.println("RESULTADO = " + x + " METROS");
		
System.out.printf("RESULTADO = %.2f metros%n", x);
		
String nome = "Maria";
		
int idade = 31;
		
double renda = 4000.0;
		
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

/*
Console

----output---
Olá Mundo!Bom Dia!
32
10.35784
10,36
10,3578
10.36
10.3578
RESULTADO = 10.35784 METROS
RESULTADO = 10.36 metros
Maria tem 31 anos e ganha R$ 4000.00 reais

*/
```

#### <a name="chapter3part6"></a>Chapter 3 - Part 6: Data Processing

Assignment command

(variable) = (expression);

Good Practice - Always indicate the type of the number, if the expression is floating point (not entire).

For double use .0 or d

For float use f

Numbers (1, 2, 3...etc) are integers in Java.

```java
int x, y;
		
x = 5;
y = 2 * x;
		
System.out.println(x);
System.out.println(y);
		
int x2;
		
double y2;
		
x2 = 5;
y2 = 2 * x2;
		
System.out.println(x2);
System.out.println(y2);
		
double b, B, h, area;
		
b = 6.0;
B = 8.0;
h = 5.0;
		
area = (b + B) / 2.0 * h;
System.out.println(area);

/*
Console

----output---
5
10
5
10.0
35.0

*/
```

#### <a name="chapter3part7"></a>Chapter 3 - Part 7: Casting

It is the explicit conversion from one type to another.

It is necessary when the compiler is not able to “guess” that the result of an expression must be of another type.

```java
int x3, y3;
		
double resultado;
		
x3 = 5;
y3 = 2;
resultado = x3 / y3; // result a int -> 2.0 and not 2.5
		
System.out.println(resultado);
		
resultado = (double) x3 / y3; // casting
		
System.out.println(resultado);
		
double x4;
int y4;
		
x4 = 5.0;
y4 = (int) x4; // -> You can convert double to int - make a casting
		
System.out.println(y4);

int myIntValue = 100;
byte myByteValue = 100;
short myShortValue = 100;
		
int myIntTotal = (myIntValue)/2;
byte myByteTotal = (byte) ((myByteValue)/2);
short myShortTotal = (short) ((myShortValue)/2);



/*
Console

----output---
2.0
2.5
5

*/
```

#### <a name="chapter3part8"></a>Chapter 3 - Part 8: Data Input

To do data entry, we are going to create an object of type "Scanner" as follows:

```java
import java.util.Scanner;
```

```java
Scanner sc = new Scanner(System.in);

sc.close();
```

To read a word (text without spaces)

```java
Scanner sc = new Scanner(System.in);

String x;
x = sc.next(); // Input: Maria
System.out.println("Você digitou: "+ x); // Output: Você digitou: Maria

sc.close();
```

To read a word (text with spaces)

```java
Scanner sc = new Scanner(System.in);

String x;
x = sc.nextLine(); // Input: Maria Joao
System.out.println("Você digitou: "+ x); // Output: Você digitou: Maria Joao

sc.close();
```

To read a integer number

```java
Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt(); // Input: 10
System.out.println("Você digitou: "+ x); // Output: Você digitou: 10

sc.close();
```

To read a double number (text without spaces)

```java
Locale.setDefault(Locale.US); // -> Caution of the system Locale -> Use Locale.setDefault(Locale.US);

Scanner sc = new Scanner(System.in);

double x;
x = sc.nextDouble(); // 4.5
System.out.println("Você digitou: "+ x); // Output: Você digitou: 4.5

sc.close();
```

To read a char

```java
Scanner sc = new Scanner(System.in);

char x;
x = sc.next().charAt(0); // A -> if you put TRE he will pick just the first char
System.out.println("Você digitou: "+ x); // Output: Você digitou: A

sc.close();
```

To read multiple data on the same line

```java
Locale.setDefault(Locale.US); // -> Caution of the system Locale -> Use Locale.setDefault(Locale.US);

Scanner sc = new Scanner(System.in);

String x;
int y;
double z;
x = sc.next(); // Maria 30 4.5
y = sc.nextInt();
z = sc.nextDouble();
System.out.println("Você digitou: "+ x);
System.out.println("Você digitou: "+ y); 
System.out.println("Você digitou: "+ z); 

sc.close();
/*
// Output: 
// Você digitou: Maria 
// Você digitou: 30
// Você digitou: 4.5 
*/
```

To read a text UNTIL THE LINE BREAK

```java

Scanner sc = new Scanner(System.in);
String s1, s2, s3;
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();
System.out.println("DADOS DIGITADOS:");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
sc.close();

/*
input:
Bom Dia
Boa Tarde
Boa Noite

output:
DADOS DIGITADOS:
Bom Dia
Boa Tarde
Boa Noite
*/
```

ATTENTION: pending line break

```java
Scanner sc = new Scanner(System.in);

int x;
String s1, s2, s3;
x = sc.nextInt();
sc.nextLine(); // Buffer Clean
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();
System.out.println("DADOS DIGITADOS:");
System.out.println(x);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

/*
Console
Input
30
Bom Dia
Boa Tarde
Boa Noite

----output---
DADOS DIGITADOS:
30
Bom Dia
Boa tarde
Boa Noite
*/
```

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		
		System.out.println("Você digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou: "+ y);
		
		double z;
		
		z = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", z);
		
		char a;
		
		a = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + a);
		
		String x2;
		int y2;
		double z2;

		x2 = sc.next(); // Separador de espaço padrão
		y2 = sc.nextInt();
		z2 = sc.nextDouble();
		sc.nextLine(); // limpeza de buffer

		System.out.println("Dados Digitados");
		System.out.println(x2);
		System.out.println(y2);
		System.out.println(z2);
		
		String s1, s2, s3;

		s1 = sc.nextLine(); 
		s2 = sc.nextLine(); 
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int x3;
		String s4, s5, s6;

		x3 = sc.nextInt();
		sc.nextLine(); // limpeza de buffer
		s4 = sc.nextLine(); 
		s5 = sc.nextLine(); 
		s6 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:"); 
		System.out.println(x3); 
		System.out.println(s4); 
		System.out.println(s5);
		System.out.println(s6);
		
		sc.close();
	}

}

/*
Console

----output---

*/
```

#### <a name="chapter3part9"></a>Chapter 3 - Part 9: Mathematic Functions

Librarie: java.lang.Math

| Example              | Meaning |
| :------------------: | :----------------------------------------------:|
| A = Math.sqrt(x);    | Variable A receives the square root of x        | 
| A = Math.pow(x, y);  | Variable A receives the result of x raised to y |
| A = Math.abs(x);     | Variable A receives the absolute value of x      




```java

public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0; 
		double z = -5.0; 
		double A, B, C;
		
		A = Math.sqrt(x); 
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A); 
		System.out.println("Raiz quadrada de " + y + " = " + B); 
		System.out.println("Raiz quadrada de 25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A); 
		System.out.println(x + " elevado ao quadrado = " + B); 
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y); 
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
	}

}

/*

Console

----output---
Raiz quadrada de 3.0 = 1.7320508075688772
Raiz quadrada de 4.0 = 2.0
Raiz quadrada de 25 = 5.0
3.0 elevado a 4.0 = 81.0
3.0 elevado ao quadrado = 9.0
5 elevado ao quadrado = 25.0
Valor absoluto de 4.0 = 4.0
Valor absoluto de -5.0 = 5.0

*/

```

## <a name="chapter4"></a>Chapter 4: Conditional Structure

#### <a name="chapter4part1"></a>Chapter 4 - Part 1: Comparison Operators in Java

Comparison operators are used to compare two values. This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either ```true``` or ```false```.

```java
int x = 5;
int y = 3;
System.out.println(x > y);

/*

Console

----output---
// returns true, because 5 is higher than 3

*/

```

| Operator | Name                     | Description                              |Example     |
| :-------:| :-----------------------:|:---------------------------------------: |:---------: |
| ==       | Equal to                 | Adds together two values                 | x == y     |
| !=       | Not equal                | Subtracts one value from another         | x != y     |
| >        | Greater than             | Multiplies two values                    | x > y      |
| <        | Less than                | Divides one value by another             | x < y      |
| >=       | Greater than or equal to | Returns the division remainder           | x >= y     |
| <=       | Less than or equal to    |	Increases the value of a variable by 1   | x <= y     |

#### <a name="chapter4part2"></a>Chapter 4 - Part 2: Logical Operators in Java

You can also test for true or false values with logical operators.

Logical operators are used to determine the logic between variables or values:

| Operator | Name                     | Description                                             |Example                   |
| :-------:| :-----------------------:|:------------------------------------------------------: |:-----------------------: |
| &&       | Logical and              | Returns true if both statements are true                | x < 5 &&  x < 10         |
| ```||``` | Logical or               | Returns true if one of the statements is true           | x < 5 ```||``` x < 4     |
| !        | Logical not              | Reverse the result, returns false if the result is true | !(x < 5 && x < 10)       |

```java

```



#### <a name="chapter4part1"></a>Chapter 4 - Part 1: Conditional Statement in Java

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

#### <a name="chapter4part2"></a>Chapter 4 - Part 2: While Statement in Java

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

#### <a name="chapter4part3"></a>Chapter 4 - Part 3: For Statement in Java

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

## <a name="chapter5"></a>Chapter 5: Data Structure

#### <a name="chapter5part1"></a>Chapter 5 - Part 1: Vectors in Java

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

#### <a name="chapter5part2"></a>Chapter 5 - Part 2: Matrix in Java

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
## <a name="chapter6"></a>Chapter 6: Object Oriented

#### <a name="chapter6part1"></a>Chapter 6 - Part 1: Abstraction

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

#### <a name="chapter6part2"></a>Chapter 6 - Part 2: Encapsulation

Adds security to an object-oriented application, as it hides class properties.

o An object must not expose any attributes (use of access modifiers - private, protected ...)
o Class attributes are usually accessed by special methods (Getters and Setters), avoiding direct access to the object's property.
o Analogy with a television: When you click on the call button, we do not know what happens internally on the TV. We can say that the methods that connect the TV are encapsulated.

#### <a name="chapter6part3"></a>Chapter 6 - Part 3: Inheritance

Type of association between classes that allows a class to inherit all data and behavior from another

o Can be used for code reuse
o Used for polymorphism - A class has several uses
The whole class java me, inherits from Object (Warper Classes)

#### <a name="chapter6part4"></a>Chapter 6 - Part 4: Polymorphism

A feature that allows variables of the same more generic type to be able to point to objects of different specific types, thus having different behaviors according to each specific type. In some cases, we must perform the upcasting or dowcasting of the object.

<!-- URL's -->
