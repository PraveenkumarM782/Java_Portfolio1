package com.Drusoft;

import java.util.Scanner;

//task 2 and 3  printing on separate lines and same lines
public class NameID
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your Name?");
		String str1= sc.nextLine();
		
		System.out.println("enter your id");
		int id=sc.nextInt();
		
		System.out.println("-----------Printing on seperate line----------------");
		System.out.println("your Name is :"+str1);
		
		System.out.println("your ID is   :"+id);
		
		System.out.println("----------------------------");
		
		System.out.println("------------Printing on same line----------------");
		
		System.out.println("your Name is :"+str1+" and ID is:"+id);
		
		
	}
	
	
}
