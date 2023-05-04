package Praveen3rdmay_2;
//NESTED IF EXAMPLES

public class Findingoutput2 {

	public static void main(String[] args) 
	{
		int num1=10,num2=5,num3=20,largestNumber;
		
		if(num1>=num2)
		{
			if(num1>=num3)
			{
				largestNumber = num1;
				
			}
			else
			{
				largestNumber = num3;
			}
		}
		else
		{
			if(num2>=num3)
			{
				largestNumber = num2;
			}
			else
			{
				largestNumber = num3;
			}
		}
		
		System.out.println("Largest number is:"+largestNumber);
		

	}

}

//It will give ,output is Largest number is:20
