package Praveen11thMay;
// Creating and Defining the Thread by Extending the Thread Class

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread1 t = new MyThread1();
			t.start();
			
			
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Main Thread:!!");
		 }
			
	}

}
  //HEre We can't guess the output , Output is totally depends upon Thread schedular
 // and it is also depends upon machine to machine 