package Praveen8thMay;
//Write a program to initialize an ArrayList in java?       AND,
//Write a program to find the length of the ArrayList?  by using size() method
import java.util.ArrayList;

public class ArrayListinitialise1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("dosa");
		al.add('A');
		al.add(45.50);
		al.add(null);
		al.add("Praveen");
		al.add(false);
		
		
		System.out.println(al);
		
		System.out.println("finding size of aray list ...");
		System.out.println("Size of arraylist is = "+al.size());
		
	
	}

}
