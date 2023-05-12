package Praveen11thMay;

//Creating and Defining the Thread by implementing  the Runnable interface

public class ThreadDemo2{
	
	public static void main(String[] args) {
		
		MyRunnable1 r = new MyRunnable1();
		
		Thread t = new Thread(r);
		t.start();
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread!!!");
		}
		
	}
	

}
//output:-  We will get mixed output we can't tell exact output..