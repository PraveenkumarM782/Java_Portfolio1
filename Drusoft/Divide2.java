package com.Drusoft;
import java.util.Scanner;    //tast 7 Divide any 2 number

public class Divide2 
{ 
	public static int divide(int a, int b)   //method division
	{
		int d=a/b;
		return d;
		
	}
	public static int add(int a,int b)     //method additon
	{
		int tot = a+b;
		return tot;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------Division-----------------");
		
		System.out.println("enter 1st number :");
		int n1 = sc.nextInt();
		System.out.println("enter 2nd number :");
		int n2 = sc.nextInt();
		
		int result = divide(n1,n2);	
		System.out.println("the division of "+n1+" and "+n2+" is :"+result);
		
		System.out.println("-------------Addition--------------------");
		
		System.out.println("enter 1st number to add :");
		int a1 = sc.nextInt();
		System.out.println("enter 2nd number to add :");
		int a2 = sc.nextInt();
		
		int total = add(a1,a2);
		System.out.println("the addition of "+a1+" and "+a2+" is :"+total);
		
		
	}
}
