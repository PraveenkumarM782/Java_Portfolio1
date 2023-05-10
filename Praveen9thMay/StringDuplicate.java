package Praveen9thMay;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate 
{
	public static void main(String[] args) 
	{
		String str1 ="Apple Mango Banana pears Apple Mango";
		
		//String str2 ="pineapple gauvava mango jackfruit apple";
		
		String str2[]=str1.split(" ");
		
		
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
		
		HashSet<String> s = new HashSet();
		
		for(int j=0;j<str2.length;j++)
		{
			s.add(str2[j]);
		}
		
		System.out.println("Print without duplication is .....");
		System.out.println(s);
	}

}
