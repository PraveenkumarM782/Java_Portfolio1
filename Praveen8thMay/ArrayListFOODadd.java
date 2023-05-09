package Praveen8thMay;
// Write a program to add elements to ArrayList ?(create a list with food items and 
// some foods to it)

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFOODadd {
	
	public static void main(String[] args) {
		
		ArrayList food = new ArrayList();
										//These are my favourites food items ..just small list is mentioned
	    food.add("Poha");
	    food.add("Vada Pav");
	    food.add("Maggie");
	    food.add("egg bhurgi");
	    food.add("fish curry");
	    food.add("aloo paratha");
	    food.add("Kadhi rice");
	    food.add("Chicken Curry");
	    
    
	    
	    System.out.println(" Food ITEMS are ..");
	    
	    for(int i=0;i<food.size();i++)
	    {
	    	System.out.println(i+1+": "+food.get(i));
	    }
		
	    //using iterator 
	    
	    System.out.println("----------");
	    Iterator itr = food.iterator();
		
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		
		//write a program to check if element(pizza) exists in ArrayList
	    
	    System.out.println("whether pizza exists or not in arraylist \n :"+food.contains("pizza"));
	    
	    System.out.println("whether maggie exists or not in arraylist \n :"+food.contains("Maggie"));
	    
	    
		
	}

}
