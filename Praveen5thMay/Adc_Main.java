package Praveen5thMay;

public class Adc_Main 
{
	public static void main(String[] args) 
	{
		
		 Adc_Cats aobj = new  Adc_Cats ();
		 aobj.cats();
		 aobj.dogs();        //still it calls to cats() method again
		 System.out.println("-----------------------");
		 
		 Adc_Dogs dobj = new Adc_Dogs();
		 dobj.dogs();
		 dobj.cats();         // still it calls to dogs() method again
		 
		 
		
	}

}
