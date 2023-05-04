package Praveen3rdmay_2;

import java.util.Scanner;

//Given an integer, , print its first  multiples. Each multiple  (where ) 
// should be printed on a new line in the form: N x i = result.

public class MathsTABLE
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number...");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
