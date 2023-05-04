package Praveen3rdmay_2;

import java.util.Scanner;

//Write a value-returning method, isVowel that returns the value true if a given character is a vowel, 
//and otherwise returns false. In main() method accept a string from user and count number of vowels in that string
public class IsVowelprg 
{
	public static  boolean isVowel(char character)
	{
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'
				||character=='A'||character=='E'||character=='I'||character=='O'||character=='U')
		{
			return true;
		}
		else
			return false;
		
	}
	public static void main(String[] args)
	{
		
		System.out.println("enter any character..");
		
		Scanner sc = new Scanner(System.in);
		
		
		char ch=sc.next().charAt(0);
		
		
		
		boolean result = isVowel(ch);
		
		System.out.println(result);
		
		
	}

}
