package Praveen9thMay;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1basic {
	
	 public static void main(String args[]){  
	   //student rollno and name 
	  LinkedHashMap<Integer,String> student=new LinkedHashMap<Integer,String>();  
	  
	  student.put(45, "Amit");  
	  student.put(35, "Vijay");  
	  student.put(28, "Rahul"); 
	  student.put(30, "Prakash");
	  student.put(18, "nihal");
	  
	for(Map.Entry m  :student.entrySet()){      //for-each loop
		
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  

	 }
}
