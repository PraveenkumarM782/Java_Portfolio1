package Praveen3rdMay;
// Switch problems: try switch case for printing the values for grade..
// Suppose if grade is A, print someting like, good or above 90%, something like that.. 
// try to have 4-5 cases and default block as well


public class GradeProblemSwitch
{
	public static void main(String[] args)
	{
		 // score (0-100)
	      int marks_scored = 82;
	      String grade = null;
	      
	      switch(marks_scored/10) 
	      {
	        // for >= 90
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        // for >= 80 and <90
	        case 8:
	           grade = "B";
	           break;
	        // for >= 70 and <80
	        case 7:
	           grade = "C";
	           break;
	        // for >= 60 and <70
	        case 6:
	           grade = "D";
	           break;
	        // for >= 50 and <60
	        case 5:
	           grade = "E";
	           break;
	        // for < 50
	        default:
	           grade = "F";
	           break;
	      }
	      
	      // display result
	      System.out.println("Grade = " + grade);
	      
	    
	      
	      
	   }

		

}
