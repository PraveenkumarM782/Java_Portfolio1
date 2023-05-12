package Praveen11thMay;
//// Creating and Defining the Thread by Extending the Thread Class

public class MyThread1 extends Thread {
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread>>");
		}
		
	}
}
