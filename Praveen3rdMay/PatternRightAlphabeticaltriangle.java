package Praveen3rdMay;

import java.util.Scanner;

public class PatternRightAlphabeticaltriangle
{
	public static void main(String[] args) 
	{
		char ch='A';
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(ch);
				 ch++;
			 }
			 
			 System.out.println("");
		}
		
		
	}

}
