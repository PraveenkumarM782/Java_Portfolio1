package Praveen9thMay;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	public static void main(String[] args) {
		
		LinkedHashSet fruits = new LinkedHashSet();
		
		fruits.add("banana");
		fruits.add("mango");		//insertion order is maintained
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("chikoo");
		fruits.add("banana"); //duplicaties not allowed
		
		System.out.println(fruits);
		
		  Iterator<String> itr = fruits.iterator();  
		  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  
		System.out.println("");
		  System.out.println( "IS cherry contains >>"+ fruits.contains("cherry"));
		
		  System.out.println( "IS empty set >>>"+fruits.isEmpty());
		  
		  System.out.println("clear the set elements::");
		  fruits.clear();
		  System.out.println("After clear() method>>.");
		  System.out.println(fruits);
	}

}
