package Praveen15thMay;

@FunctionalInterface
interface AA
{
    	void show();
	//  void run();  // we can't write 2 abstract methods..here
	
}

//class B implements AA
//{
//	public void show()
//	{
//		System.out.println(" in show ..");
//	}
//}

public class FunctionalInterfaceD1 {
	
	public static void main(String[] args) {
		
		// AA aobj = new B();
 
		
		          AA aobj = new AA()
		    		{		
		    			public void show()
		    			{
		    				System.out.println("in show...");
		    			}
		    	
		    		}
		    		;
		
			aobj.show();
		
			
	}

}
