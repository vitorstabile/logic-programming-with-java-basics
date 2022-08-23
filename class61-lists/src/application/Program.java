package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(); // Use of warper class
		
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");

		list.removeIf(x -> x.charAt(0) == 'M'); //lambda function //remover
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Marco is no more in the list
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //filtrar
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //achar o primeiro
		System.out.println(name);
		
		System.out.println("---------------------");
		String name2 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //achar o primeiro
		System.out.println(name2);

		
	}
}