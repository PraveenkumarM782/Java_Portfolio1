package Praveen8thMay;

public class StringPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Finding the palindrome of a string :");
		
		String str1="nitin";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2 = str2+str1.charAt(i);
			
		}
		
		System.out.println("The reverse of the string is:"+str2);
		
		if(str1.equals(str2))
		{
			System.out.println("true,This is palindrome");
		}
		else
			System.out.println("false,This is not palindrome");
		
		
	}
}
