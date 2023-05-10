package Praveen9thMay;

import java.util.HashMap;
import java.util.Map;

public class HashMapInitialise1 {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> course = new HashMap();
		
		course.put("core java  ", 5000);
		course.put("Springboot ", 8000);
		course.put("Angular    ", 7000);
		course.put("HTML&CSS   ", 4500);
		course.put("c#.net     ", 6000);
		course.put("python     ", 5500);
		
		System.out.println("values = "+course);
		
		 // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,Integer> entry : course.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        
		
	}

}
