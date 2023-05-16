package Praveen15thMay;

// https://www.youtube.com/watch?v=V7yVbG9_xkM
// refer Teluko video Anonymous Inner class

//What is Anonymous Inner Class ?
/*
* Anonymous Inner Class means 
*   Defining a class with no identity inside the method (like -main method)
* 
*/
class A
{
	public void show()
	{
		System.out.println("in A  Show method :");
		
	}
}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("I am the Best : B's method");
//		
//	}
//}

public class AnonymousDem01 {
	
	public static void main(String[] args) {
		
		
		
		A obj = new A()
				{
					public void show()
					{
						
						System.out.println("I am the Best : B's method");
							
					}
						
				}
				;
		obj.show();
		
		
	}

}
