package Praveen3rdmay_2;



public class Forlooptask1
{
	public static void main(String[] args) 
	{
		//using for loop, print numbers from 1 to 10
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("----------------------------------------");
		//using for loop, print numbers from 10 to 1
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------");
		//using for loop, print numbers from 15 to 10
		
		for(int i=15;i>=10;i--)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------");
		//store your name in a variable and print it 3 times
		
		String name="Praveen";
		int count=1;
		for(int n=0;n<3;n++)
		{
			System.out.println("name="+"("+count+")"+name);
			count++;
		}
		
		System.out.println("----------------------------------------");
		//using do while loop, and print numbers 1 to 5
		System.out.println("using do while loop print numbers 1 to 5");
		int n=1;
		do
		{
			System.out.println(n);
			n++;
		}while(n<=5);
		
		System.out.println("----------------------------------------");
		
		//use while loop, and print numbers 1 to 
		System.out.println("use while loop print numbers 1 to 5");
		int m=1;
		while(m<=5)
		{
			System.out.println(m);
			m++;
		}
		System.out.println("----------------------------------------");
		//print following using loop 2 4 6 8 10
		
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		
	}

}


