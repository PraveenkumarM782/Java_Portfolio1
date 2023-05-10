package Praveen9thMay;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEg01 {

	public static void main(String[] args) {


		Hashtable<String, Integer> mobile = new Hashtable<>();

		// Adding elements to the hashtable

		mobile.put("Apple", 100000);
		mobile.put("oneplus", 55000);
		mobile.put("samsung", 60000);

		// Getting values from the hashtable
		int valueA = mobile.get("Apple");
		System.out.println("Value of A: " + valueA);

		
		// Enumerating the elements of the hashtable
		Enumeration<String> keys = mobile.keys();
		
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("Key: " + key + ", Value: " + mobile.get(key));
		}
		
		// Removing elements from the hashtable
				mobile.remove("oneplus");

				System.out.println("After removing oneplus..");
				System.out.println(mobile);

	}

}
