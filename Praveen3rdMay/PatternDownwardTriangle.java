package Praveen3rdMay;

import java.util.Scanner;

public class PatternDownwardTriangle
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print downward triangle pattern..");
		
	    int row=sc.nextInt();
	    
	    for(int i=row;i>=1;i--)  //rows
	    {
	    	for(int j=1;j<=i;j++)   //colms
	    	{
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println("");
	    }
		
	}

}
