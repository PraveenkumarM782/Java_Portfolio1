package Praveen15thMay;
// There are 4 types of INNER Classses 
//1. Nested Inner Class   2. static Inner Class  3. method Local Inner Class   4. Anonymous Inner Class

// 	Nested Inner Class
// in NORMAL inner class we can't write static block 

public class ClassAnon {
	
	private void meth1(){
		
		System.out.println("I am from outer class>>");
	}

	public ClassAnon() {
		System.out.println(" Outer class Constructor ...[This will execute second ]");
	}
	
	static{
		
		System.out.println(" Outer class Static block..[This will execute Very first]");
	}
	
	
	public static void main(String[] args) {
		
		ClassAnon obj = new ClassAnon();
		obj.meth1();
		
		System.out.println("--------------------------------");
		
		obj.meth1();
		
	}
	
}

//In ClassAnon2 further changes has been made.