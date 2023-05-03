package Praveen2ndmay;

import java.util.Scanner;

public class StringMoviebook 
{
	public static void main(String[] args) 
	{
		String movie = "";
		String book = ""; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie name :");
		 movie = sc.nextLine();
		 
		 System.out.println("enter Book name :");
		 book = sc.nextLine();
		
		System.out.println("movie name :"+movie+" \nbook name : "+book);
		
	}

}
