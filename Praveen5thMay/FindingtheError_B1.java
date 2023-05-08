package Praveen5thMay;

public class FindingtheError_B1 implements FindingtheError_A1{
	
	   void m1()    //public void m1()   This should be public 
	   {
		 System.out.println("One");
		}
}
//NOTE:solution: We cannot reduce the visibility of inherited method from interface A1.

