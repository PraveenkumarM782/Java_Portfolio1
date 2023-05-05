package Praveen4thMay;
//main method here, calling all other classes rbi,icici,pnb,sbi
public class Bank
{
	public static void main(String[] args) 
	{
		RBI robj = new RBI();
		
		System.out.println("The rate of interest in Rbi is : "+robj.rate()+"%");
		
		System.out.println("----------------------------");
		
		SBI sbiobj = new SBI();
		
		System.out.println("The rate of interest in Sbi is : "+sbiobj.rate()+"%");
		
		System.out.println("----------------------------");
		
		PNB pobj = new PNB();
		 
		System.out.println("The rate of interest in PNB is : "+pobj.rate()+"%");
		
		System.out.println("----------------------------");
		
		ICICI iobj = new ICICI();
		
		System.out.println("The rate of interest in ICICI is : "+iobj.rate()+"%");
	
	}

}
