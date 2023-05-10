package Praveen9thMay;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	public static void main(String[] args)
	{
		
		HashSet hs = new HashSet();
		
		 hs.add(100);
		 hs.add(200.55);
		 hs.add(300);
		 hs.add("praveen");
		 hs.add(null);
		 hs.add(null);  //can't store multiple null values 
		 hs.add("praveen");  //not accepting duplicates values
		 hs.add(808);
		 
		 //doesn't follows insertion order 
		 //it can store hetrogeneous data elements means different datatypes 
		 
		 System.out.println(hs);
		 
		 HashSet hs2 = new HashSet();
		 
		 hs2.add(50);
		 hs2.add(20);
		 hs2.add(10);
		 hs2.add(40);
		 hs2.add(30);
		 
		 //Note : hashset doesn't follows sorting order 
		 
		 System.out.println(hs2);  //[50, 20, 40, 10, 30]
		 
		 
		 Iterator itr = hs2.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 HashSet hs3= new HashSet(hs2); //parameterised constructor
		
		 hs3.add("Iphone");
		 hs3.add("sony");
		 hs3.add("jio");
		 // hs3.addAll(hs);//we can do like this also
		 
		 System.out.println(hs3);
		 
		//contains method
		 System.out.println(hs3.contains("sony"));  //true 
		 
		 hs3.remove("jio");  //remove() method
		 System.out.println(hs3);
		 
		 hs3.clear();
		 System.out.println(hs3); //we get empty hashset
		 
		
		
		 
	}

}
