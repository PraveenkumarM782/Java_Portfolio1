package Praveen3rdMay;

import java.util.Scanner;

//if it's saturday or sunday, i have to print it's weekend ;) 
// if it's other days, i have to print, it's weekday :(


public class IFStatementtask1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the day of week ..");
		String day=sc.nextLine();
		
		//String day="monday";
		
		
		//if(day.compareTo("monday"||(day.compareTo("tuesday"))||day.compareTo("wednesday")||day.compareTo("Thursday")||day.compareTo("friday"))
		
		if(day=="monday"||day=="tuesday"||day=="wednesday"||day=="thursday"||day=="friday")	
		{
			System.out.println("It's WEEKDAY ");
		}
		else 
		{
			System.out.println("It's WEEKEND ");
		}
		
	
		
		
	}

}
