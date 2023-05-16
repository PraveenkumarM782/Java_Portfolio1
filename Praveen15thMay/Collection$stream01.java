package Praveen15thMay;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection$stream01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(3);
		aList.add(5);
		aList.add(6);
		aList.add(7);
		
		//iterating 1st time
		
		Iterator<Integer> iterator = aList.iterator();
		
		while(iterator.hasNext()) {		
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------");
		//iterating 2nd time
		
		Iterator<Integer> iterator2 = aList.iterator();
		
		while(iterator2.hasNext()) {		
			System.out.println(iterator2.next());
		}
		
	}

}
