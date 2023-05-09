package Praveen8thMay;
//Write a program to remove element from specified index of ArrayList

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListRemoveSpecificIndex {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("coffee");
		al.add("dosa");
		al.add("bread");
		al.add("chips");
		al.add("mixture");
		al.add("pakoda");
		al.add("samosa");
		
		
		System.out.println(al);
		
		System.out.println(" remove element from specified index  ..suppose 3rd index");
		
		Object b = al.remove(3);
		
		System.out.println("After removing 3rd index : i.e "+b);
		
		System.out.println(al);		
		
	}

		
	
}
