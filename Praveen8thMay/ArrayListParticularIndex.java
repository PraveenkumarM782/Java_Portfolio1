package Praveen8thMay;

//Write a program to add element at particular index of ArrayList?(try adding icecream at 4th index)

import java.util.ArrayList;

public class ArrayListParticularIndex {
	
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
		
		System.out.println("try adding icecream at 4th index..");
		
		al.add(4,"ice cream");
		
		System.out.println("After insertion new list is-");
		System.out.println(al);
		
	}

}
