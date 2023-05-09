package Praveen8thMay;
//Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.ArrayList;

public class ArrayListreterive1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("dosa");
		al.add('A');
		al.add(45.50);
		al.add(null);
		
		System.out.println(al);
		
		System.out.println("Reterive the element from specific position..");
		
		System.out.println("3rd position value is = "+al.get(3));
		
		
		
		System.out.println("By using loops also you can retreive..");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("position :"+i+" is = "+al.get(i));
		}
		
	}

}
