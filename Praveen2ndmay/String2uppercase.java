package Praveen2ndmay;
/*
 * 
 * The following code starts with String firstNameCaps = ALEX; and should print Alex. 
 * Use the toLowerCase and substring methods to do accomplish this task. 
 * public class Test1 { public static void main(String[] args) { String firstNameCaps = "ALEX";
 *  System.out.println(firstNameCaps); } }
 *  
 * */
 
public class String2uppercase
{
	
	public static void main(String[] args) 
	{
		
		String str1 ="ALEX";
		
		System.out.println("Convert First letter capital rest smaller");
		
		System.out.println("Earlier : "+str1);
		
		String str2=str1.substring(0,1);
		
		String str3= str1.substring(1, 4);
		
		
		System.out.println("Later   : "+str2+str3.toLowerCase());
		
	}
	

}
