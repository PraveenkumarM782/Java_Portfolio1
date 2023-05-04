package Praveen3rdMay;
//Try affording an iphone of 50. If not, try afford a redmi of 25 If not,
//  try buying normal nokia set of 10 If not, return home

public class NESTEDiFProblem
{
	public static void main(String[] args)
	{
		int moneyinwallet = 25000;              // 1 Lakh
		
		int iphone=50000,redmi=25000,nokia=10000;
		
		System.out.println("YOU HAVE "+moneyinwallet+"Rs in your WALLET");
		System.out.println("");
		
		System.out.println("*****Let check which phone you can buy****");
		System.out.println("IPHONE----REDMI-----NOKIA");
		System.out.println("50k-------25k-------10k");
		
		System.out.println("");
		
		
		if(moneyinwallet>=10000 )
		{
			System.out.println("you can buy 'Nokia' phone ..");
			
			if(moneyinwallet>=25000)
			{
				System.out.println("or 'Redmi' phone... ");
				
				if(moneyinwallet>=50000)
				{
					System.out.println("or IPHONE also..");
				}
				else
				{
					System.out.println("*but not IPHONE*");
				}
			}
			else
			{
				System.out.println("*But ,not Redmi or Iphone*");
			}
			
		}
		else
			System.out.println("SORRY!!,*you can't even buy Nokia phone also..*");
		
	}

}
