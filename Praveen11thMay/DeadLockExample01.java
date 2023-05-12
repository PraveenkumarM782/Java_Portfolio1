package Praveen11thMay;

public class DeadLockExample01 {
	
	public static void main(String[] args) {
		
		final String A="Angular";
		final String B="Bootstrap";
		
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized(A) //Angular is holded by Thread1
				{
					System.out.println("Thread 1 locked on A ");
					
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					synchronized(B)   //Thread 1 will be waiting for BootStrap
					{
						System.out.println("Thread 1 locked on B");
					}
					
					System.out.println("No DEadLock ");
					
				}
			}
		};
		
		Thread t2 = new Thread(){
			
			public void run()
			{
				 synchronized(B)  //Python is holded by Thread 3
				 {
					System.out.println("Thread 2 locked on B :");
					
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					synchronized(A)	  //Thread 2 will be waiting for Java
					{
						System.out.println("Thread 2 locked on A :");
					}
				}
				
				System.out.println("No Dead Lock ");
			}
			
		};
		
		t1.start();
		t2.start();
		
	}

}
