package Praveen10thMay;

public class IllegalArguException01 {
	
	int m;
	public static void setMarks(int marks){
		
		   if(marks<0 || marks>100)  //throw exception if marks are not in range
			   
		         throw new IllegalArgumentException(Integer.toString(marks));
		      else
		         System.out.println("Marks Entered: " + marks);
		  
	}
	
	public static void main(String[] args){
	   
				      setMarks(45);
				      setMarks(101);
		
		}

}
