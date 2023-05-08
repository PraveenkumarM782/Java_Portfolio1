package Praveen5thMay;

public class BankA extends Bank{
	public int bal = 100;

	@Override
	public void getBalance() {
		
		System.out.println("Your balance of Bank A is :"+bal);
	}

}
