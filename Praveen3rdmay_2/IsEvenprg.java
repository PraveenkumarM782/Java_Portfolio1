package Praveen3rdmay_2;

import java.util.Scanner;

//Write a method named isEven that accepts an int argument.
//The method should return true if the argument is even, or false otherwise

public class IsEvenprg 
{
	
	public boolean isEven(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the number to check whether even or not");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		IsEvenprg obj1 = new IsEvenprg();
		boolean result = obj1.isEven(num);
		
		System.out.println(result);
		System.out.println("");
		
	}
}
