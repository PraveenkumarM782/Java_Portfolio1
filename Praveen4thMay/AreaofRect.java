package Praveen4thMay;

import java.util.Scanner;

//4.Write a program to print the area of a rectangle by creating a class named 'Area' taking the
//values of its length and breadth as parameters of its constructor and having a method named 
//'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

public class AreaofRect 
{
	int length;
	int breadth;
	
	
	public AreaofRect(int l,int b) 
	{
		length =l;
		breadth=b;
	}
	
	public int Area()
	{
		return length*breadth;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breath ");
		
		int len,bre;
		len=sc.nextInt();
		bre=sc.nextInt();
		
		AreaofRect obj = new AreaofRect(len,bre);
		
		
		System.out.println("Area of Rectangle is:"+obj.Area());
		
		
		
	}

}
