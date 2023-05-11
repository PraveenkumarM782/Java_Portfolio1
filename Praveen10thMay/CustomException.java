package Praveen10thMay;

import java.util.Scanner;

public class CustomException {
	//method to check the age
	
	static void validate(int age) throws InvalidAgeException{
		
		if(age<18) {
			//throw an object of user defined exception
			
			throw new InvalidAgeException("age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote:");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :?");
		int age = sc.nextInt();
		
		try
		{
			validate(age);        //calling the method
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("Caught the exception");
			//printing the message from InvalidAgeException object
			
			System.out.println("Exception occured:"+ex);
		}
		
		System.out.println("rest of the code...");
		
	}

}
