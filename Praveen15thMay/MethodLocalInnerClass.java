package Praveen15thMay;
// MethodlocalInnerClass ?  What is MethodlocalInnerClass

/*
 * Ans :	method local Inner class is a class which is present inside the method of outer class
 * 
 */

public class MethodLocalInnerClass {

	void meth1() 
	{
		String s = "java";
		
		System.out.println("method one ..");   //suppose this will execute first
		
	    	class InnerClass   //local inner class 
		    {
					void display(String data)
					{
						System.out.println(s+"---"+data);
						System.out.println(s.concat(data));
					}
					
					InnerClass()   //Inner Class Constructor 
					{
						System.out.println("Inner Class Constructor :");
					}
	        }
	    	
	    	
		new InnerClass().display(" is awesome :");
		
	}
	
	public static void main(String[] args) {
		
		new MethodLocalInnerClass().meth1();
	}
	
}
