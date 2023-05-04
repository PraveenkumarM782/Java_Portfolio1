package Praveen3rdMay;

import java.util.Scanner;

public class PatternRightTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print left triangle pattern..");
		
	    int row=sc.nextInt();
	    int j;
	    
	    for(int i=row;i>0;i--)
	    {
	    	for( j=0;j<=i-1;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	for(int k=0;k<=row-i;k++)
	    	{
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println("");
	    }
		
	}

}
