package Praveen15thMay;

public class RemoveRepeatedchar {
	
	public static void main(String[] args) {
		
		
		String str1 = "Praveen";
		
		char[] ch = str1.toCharArray();
		int count;
		
		
		
		
		for(int i=0;i<str1.length()-1;i++)
		{
			count=1;
			for(int j=i+1 ;j<str1.length()-1;j++)
			{
				
			
				if(ch[i]==ch[j])
				{
					count++;
					
				}
				
			}	
			
			if(count==1 && ch[i]!=0)
			{
				System.out.println(ch[i]+"");
			}
		}
		
		
	}

}
