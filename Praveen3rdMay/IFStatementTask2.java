package Praveen3rdMay;
//you have 100 rupee, and your favourite icecream is 50 rupee. Write a logic to find whether you’ll 
// be able to buy a icecream or not. If yes, print , “yummy”, if no, print, “let me buy next time”


public class IFStatementTask2 
{
	public static void main(String[] args) 
	{
		
		int rupee=100;
		
		int favoriteIcecream=50;
		
		
		System.out.println("let's check whether you can buy ur favourite icecream or not..");
		
		
		if(rupee<favoriteIcecream)
		{
			System.out.println("NO, you have less money, YOU CAN'T BUY THIS TIME.");
		}
		else
			System.out.println("Yes, you CAN BUY YOUR FAV ICECREAM!!!");
		
		
		
	}

}
