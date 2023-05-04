package Praveen3rdmay_2;
//optimise this code...

public class SwitchVowelExample 
{
	public static void main(String[] args) 
	{
		char ch='O';   
		
		//char ch='Z';
	
		
		switch(ch)
		{
			case 'a':     // optimising from here to
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':       //till here optimised.
				System.out.println("vowel");
				break;
				
			default:
				System.out.println("Consonant");
		}
		
		
	}

}
