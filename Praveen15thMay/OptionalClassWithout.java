package Praveen15thMay;

public class OptionalClassWithout {
	
	public static void main(String[] args) {
		
		String[] words = new String[10];
		
		//trying to access 2nd index of empty string
		
		String word = words[2].toLowerCase();
		System.out.println(word);
	}

}

/*
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "words[2]" is null
	at Praveen15thMay.OptionalClassWithout.main(OptionalClassWithout.java:11)

 */
