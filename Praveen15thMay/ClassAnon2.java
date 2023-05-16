package Praveen15thMay;

public class ClassAnon2 {
	
		  private void meth1(){
			
			   System.out.println(" I am from outer class>>");
		   }
	
		  
				class InnerClass
				{
					void display()
					{
						System.out.println(" I am from Inner Class :");
					}
					
					InnerClass()
					{
						System.out.println(" Inner class Constructor");
					}
				}
				
		
		public ClassAnon2() {
			
			System.out.println(" Outer class Constructor ...[This will execute second ]");
		}
		
		static{
			
			System.out.println(" Outer class Static block..[This will execute Very first]");
		}
		
		
		public static void main(String[] args) {
			
		//	ClassAnon2 obj = new ClassAnon2();
		//	obj.meth1();
			
			// Directly we can't call the InnerClass directly by ClassAnon2 object 
			
			ClassAnon2.InnerClass obj1 = new ClassAnon2().new InnerClass();
			
			obj1.display();
			
			System.out.println("--------------------------------");
			
			new ClassAnon2().meth1();
			
			
		}
}
