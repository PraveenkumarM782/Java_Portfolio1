package Praveen15thMay;


public interface InterfaceADemo1 {
	
	void method1();   // abstract method
	
	default void method2()    //default method
	{
		System.out.println("This is Default method in interface 1.8v since:");
	}
	
	static void method3()   //static method
	{
		System.out.println(" STATIC method3 in interface");
	}

}
