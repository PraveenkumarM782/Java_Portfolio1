package Praveen8thMay;

import java.util.Scanner;

public class IntPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to check whether it is palindrome or not");
		int n1 = sc.nextInt();
		int n;
		int rev=0;
		int n2=n1;
		
		while(n1!=0)
		{
			n=n1%10;
			rev=(rev*10)+n;
			n1=n1/10;
			
		}
		
		if(rev==n2)
		{
			System.out.println("This is palindrome :");
			
		}
		else
			System.out.println("This is not palindrome :");
		
	}
}
