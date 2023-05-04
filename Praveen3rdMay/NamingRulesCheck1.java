package Praveen3rdMay;

public class NamingRulesCheck1
{
	public static void main(String[] args) 
	
	{
		String word ="java";            //VALID

		String Word = " comp";         //VALID

		String word@ = "java string";     //invalid   becoz ,@ not allowed
		
		String word12 = "java string";     //VALID

		String 12word = "java string";	  //invalid  becoz, it should start from letter not number

		String int = "java";			  //invalid  becoz, we can't keyword int as variable name

		String *java = "java";			 //invalid  becoz, of * symbols

		String symbol$ = "100 dollars";   //VALID

		String word ="java";		      //invalid  becoz we took duplicate variables_name

		String word = " comp";			 //invalid		same name 	
		
		String word_ ="java";			//VALID
		
		String word- ="java is here";	//invalid  becoz - dash is not allowed

		String capital; = "delhi";     //invalid becoz we can't write semicolon in variables_name
		
		
	}

}
