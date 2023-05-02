package com.Drusoft;

import java.util.Scanner;

//task 1 print your name
public class NamePrint 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your Name?");
		String str1= sc.nextLine();
		
		
		System.out.println("---------------------------");
		System.out.println("your name is :"+str1);
		
	}

}
