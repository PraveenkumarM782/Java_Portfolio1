package Praveen4thMay;
//3.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method 
//named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

public class Area 
{

	//formula of perimeter of a rectangle 2(l+b)
	public int setDim(int a,int b)
	{
	   int z;
		z=a+b;
		return 2*z;	
	}
	
	//formula for area of a rectangle is l*b;
	public int getArea(int a,int b)
	{
	  return a*b;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length and breath of Rectangle..");
		
		int l,b;
		
		l=sc.nextInt();
		b=sc.nextInt();
		
		
		Area aobj = new Area();
		
		System.out.println("Perimeter of a rectangle is :=");
		System.out.println(aobj.setDim(l, b));
		
		System.out.println("Area of a rectangle is := ");
		System.out.println(aobj.getArea(l, b));
		
		
		
	}

}
