package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(new MyComparator()); // You don't need to to implement in the class Product the comparable method. You can implement comparator
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
