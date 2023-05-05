package Praveen4thMay;

import java.util.Scanner;

public class Security_Employee_$ 
{
	public void Securitytask()
	{
		System.out.println("Take OUT YOUR ID  pLease ::");
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check whether Person is  Boss(1) or Employee(0)");
		
		System.out.println("enter 1 or 0 ");
		int result =sc.nextInt();
		
		
		if(result==1)
		{
			Security_Boss_$  bobj = new Security_Boss_$ ();
			bobj.Securitytask();
		}
		
		else
		{
			
			Security_Employee_$  sobj = new Security_Employee_$();
			sobj.Securitytask();
		
		}
		
		
		
	}

}
