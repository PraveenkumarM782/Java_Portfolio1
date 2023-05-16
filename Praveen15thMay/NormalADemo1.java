package Praveen15thMay;

public class NormalADemo1 implements InterfaceADemo1 {

	
	public void method1() //implementation abstract method 
	{	
		System.out.println("Method 1 body :");	
	}
	
	@Override
	public void method2()   //overriding default method
	{
		
		System.out.println("normalmethod inside method 2");
	}
	
	//-------------------------------------------
	
	static void method3()     //overriding static  method can't possible
	{
		System.out.println("OVerridden static method ");
	}
	
	
	public static void main(String[] args) {
		
		NormalADemo1 aobj = new NormalADemo1();
		aobj.method1();
		aobj.method2();
		InterfaceADemo1.method3();
		
		
	}
	
	

}
