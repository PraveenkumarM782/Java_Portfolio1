package Praveen15thMay;

public class InnerStatic01 {
	
	int a=10;
	static int b=20;
	
	void meth1()
	{
		System.out.println("Outer Class Method :");
	}
	
			static class InnerClass
			{
				void display()
				{
					System.out.println("Inner class method called :");
					
				//	System.out.println("outer class Instance variable :"+a);
					
				    System.out.println("Outer class static variable :"+b);			
				}
				
				static 
				{
					System.out.println("Inner class static bloack :");
				}
				
				InnerClass()
				{
					System.out.println("Inner class Constructor :");
				}
				
				public static void main(String[] args) {
					
					System.out.println("Inner class Main() :");
					
					new InnerClass().display();
				}
			}
	
		
		static 
		{
			System.out.println("Outer class static block :");
		}
		
		InnerStatic01()
		{
			System.out.println("outer class Constructor :");
		}
		
		public static void main(String[] args) {
			
			InnerStatic01.InnerClass obj2 = new InnerStatic01.InnerClass();
						
			obj2.display();
			
			System.out.println("----------------------------------");
		
			new InnerStatic01().meth1();
			
		}
		

}
