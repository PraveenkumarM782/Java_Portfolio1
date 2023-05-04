package Praveen3rdMay;

import java.util.Scanner;

public class PatternLeftTriangle 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print left triangle pattern..");
		
	    int row=sc.nextInt();
	    
	    for(int i=0;i<=row;i++)  //rows
	    {
	    	for(int j=0;j<=i;j++)   //colms
	    	{
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println("");
	    }
	    
		
	}

}
