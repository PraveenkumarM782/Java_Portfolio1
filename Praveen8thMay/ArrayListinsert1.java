package Praveen8thMay;

//Write a Java program to insert an element into the array list at the first position.
			
import java.util.ArrayList;

public class ArrayListinsert1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("dosa");
		al.add('A');
		al.add(45.50);
		al.add(null);
		
		System.out.println(al);
		
		System.out.println("Inserted at First position ...");
		
		al.add(0, "First");
		
		System.out.println(al);
	}
}


//INSERT AT FIRST POSITION ( program 1 )