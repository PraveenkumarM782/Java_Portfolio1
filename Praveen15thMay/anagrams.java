package Praveen15thMay;

import java.util.Arrays;
import java.util.Scanner;

//programs to print anagrams whether 2 string are equals in terms of letter arrangement

public class anagrams {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string :");
		String str1 =sc.next();
		
		System.out.println("Enter the 2nd String :");
		String str2 =sc.next();
		int count=0;
		int len=str1.length();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean br ;
	
		 br=Arrays.equals(ch1, ch2);
		 
		 		if(br==true)
				 {
		 			System.out.println("This is anagrams");
			 		
				 }
		 		else
		 		{
		 			System.out.println("This is not anagrams");
		 		}
		
	}

}
