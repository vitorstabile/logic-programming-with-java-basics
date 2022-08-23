package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		set.remove("Notebook");
		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'N');
		

		for (String p : set) {
			System.out.println(p); // not in order
		}

		Set<String> treeSet = new TreeSet<>();

		treeSet.add("TV");
		treeSet.add("Notebook");
		treeSet.add("Tablet");

		System.out.println(treeSet.contains("Notebook"));

		for (String p : treeSet) {
			System.out.println(p); // Alphabetic order
		}
		
		Set<String> linkedSet = new LinkedHashSet<>();

		linkedSet.add("TV");
		linkedSet.add("Notebook");
		linkedSet.add("Tablet");

		System.out.println(linkedSet.contains("Notebook"));

		for (String p : linkedSet) {
			System.out.println(p); // In order that is put
		}
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);



	}

}
