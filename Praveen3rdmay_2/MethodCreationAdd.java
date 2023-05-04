package Praveen3rdmay_2;

import java.util.Scanner;

//create a method to add two numbers and return it
//Write a program with a method named getTotal that accepts two integers as an argument 
// and return its sum. Call this method from main( ) and print the results.

public class MethodCreationAdd
{
	public int addition(int v1,int v2)
	{
		return v1+v2;
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any 2 number for Addition...");
		
		System.out.println("enter Input 1");
		int num1 =sc.nextInt();
		
		System.out.println("enter Input 2");
		int num2 = sc.nextInt();
		
		MethodCreationAdd  obj = new MethodCreationAdd();
		
		int Result = obj.addition(num1,num2);
		System.out.println("Addition is : "+Result);
	}

}
