package Praveen9thMay;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasiceg01 {
	
	public static void main(String[] args) {
		
		TreeSet foodSet = new TreeSet();
										//treeset display according to sorted order
			foodSet.add("biryani");
			foodSet.add("noodles");
			foodSet.add("dosa");
			foodSet.add("chapathi");
			foodSet.add("Pizza");            //P is capital so its comes first 
			foodSet.add("dosa"); //dup not allowed
			
		//	foodSet.add(null);  //not allowed different datatypes values
	    //  foodSet.add(1);
		//	foodSet.add(false);//  //boolean also not allowed
			
		System.out.println(foodSet);
		
		  
		TreeSet juices = new TreeSet();
			juices.add("mango");
			juices.add("lemonade");
			juices.add("strawberry");
			juices.add("watermelon");
			juices.add("oranges");
			
			System.out.println("-----------");
			System.out.println(juices);
			//adding one collection set into another
			
			foodSet.addAll(juices);
			
			System.out.println("whether equals or not ?? "+foodSet.equals(juices));
			System.out.println("-----------");
			
			System.out.println("Removing particular elements ..");
			boolean value1 = foodSet.remove("oranges");
	        System.out.println("Is oranges removed? " + value1);
	        
			System.out.println("AFter adding juices to foodSet..");
			System.out.println("-----------");
			
			Iterator itr = foodSet.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			  

	}

}
