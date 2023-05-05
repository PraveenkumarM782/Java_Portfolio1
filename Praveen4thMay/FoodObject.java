package Praveen4thMay;
//1.create a class named Food with some variables and methods and then create a object in same class, 
// try to access these methods and variables

public class FoodObject
{
	String food1="Dosa";    //instance variable
	
	 static String food4 = "masaladosa";   //static variables..
	
	public void cooking()
	{
		String food3="paratha";  //local variable

		
		System.out.println("you will get dosa at morning breakfast..");
		System.out.println("-----");
		System.out.println("you will get biryani at lunch and dinner..");
		System.out.println("-------");
		System.out.println("paratha you at get whenever you want");
	}
	

	public static void main(String[] args)
	{
		String food2="biryani";    //local variable
		
		FoodObject fo = new FoodObject();
		
		
		fo.cooking();
		
		
		
		System.out.println(fo.food1);
		System.out.println(fo.food4);
		
	}

}
