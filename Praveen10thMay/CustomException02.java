package Praveen10thMay;
//  Same GIVEN PROGRAM just rewrite // custom exception
import java.util.Scanner;

class CheckedException extends Throwable{
	 	public CheckedException()
	 	{
	 		super();
	 	}
}
public class CustomException02 {
	public static void checkSalary(int salary) throws CheckedException 
	{
		int amount =0;
		
		if(salary>10000)
		{
			throw new CheckedException();
		}
		else {
			amount = salary + 5000;
			System.out.println("Your total Salary is:"+amount);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :?");
		int sal = sc.nextInt();
		
		try {
			checkSalary(sal);
		}
		catch(CheckedException ce) {
			System.out.println("you are not eligible for bonus :");
		}
	}

}
