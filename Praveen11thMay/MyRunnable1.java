package Praveen11thMay;
// Creating and Defining the Thread by implementing  the Runnable interface

public class MyRunnable1 implements Runnable {
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread>>>");
		}
	}

}
