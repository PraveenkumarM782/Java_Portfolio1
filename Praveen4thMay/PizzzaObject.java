package Praveen4thMay;
//2.create a class called Pizza and create a object for food class and try to access the
// variables and methods in it.

public class PizzzaObject
{
	String foodname="Pizza";   //instance variable
	
	public void bakingPizza()
	{
		String fooditems="cheeze";   //local variable
		System.out.println("Pizza is baking");
		
		System.out.println("fooditems is:"+fooditems);
	}
	
	public static void main(String[] args) 
	{
		PizzzaObject po = new PizzzaObject();
		
		po.bakingPizza();
		System.out.println(po.foodname);
		
		
		
		
	}

}
