package Praveen10thMay;

public class ArithmeticException01 {
	
	public static void main(String[] args) {
		 
	        try 
	        { 
	            //define two numbers 
	            int num1 = 100, num2 = 0; 
	            int result = num1 / num2; // divide by zero 
	            //print the result
	            System.out.println("Result = " + result); 
	        } 
	        
	        catch (ArithmeticException e) 
	        { 
	            System.out.println("ArithmeticException:Division by Zero"); 
	        } 

    }

}
