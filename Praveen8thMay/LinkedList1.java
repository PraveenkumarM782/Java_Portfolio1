package Praveen8thMay;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(30);
		ll.add(50);
		ll.add(80);
		
		System.out.println(ll);
		
		System.out.println("Adding 100 at first position by using method addfirst:");
		ll.addFirst(100);
		
		System.out.println("after adding"+ll);
		
		ll.add(0,"praveen");
		System.out.println(ll);
		
		System.out.println("Get first : "+ll.getFirst());
		System.out.println("Get Last : "+ll.getLast());
		
	}

}
