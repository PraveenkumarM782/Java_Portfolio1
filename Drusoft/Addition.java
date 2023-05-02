package com.Drusoft;

import java.util.Scanner;
//task 3 addition simple
public class Addition 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any 2 numbers..");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add;
		
		 add=num1+num2;
		
	     System.out.println("addition :"+num1+" + "+num2+" is " +add);
		
		
		
	}

}
