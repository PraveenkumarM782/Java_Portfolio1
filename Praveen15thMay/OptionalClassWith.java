package Praveen15thMay;

import java.util.Optional;

public class OptionalClassWith {
	
	public static void main(String[] args) {
		
		String[] words = new String[10];
		
		words[0]="APPLE";
		words[1]="Banana";
		words[2]="Orange";
		words[3]="Banana";
		words[4]="Orange";
		words[5]="STRAWBERRY";
		words[6]="BANANA";
		words[7]="Orange";
		words[8]="Banana";
		words[9]="Orange";
		
		
		//returns value if the value presents
		//otherwise returns null
		
		Optional<String> checkNull = Optional.ofNullable(words[6]);
		
		//if a value is present, 
		//isPresent() will return true
		
		if(checkNull.isPresent()) {
			
			String word = words[6].toLowerCase();
			System.out.println(word);
		}
		//as there is no value present, the else part will be executed
		else
			System.out.println("Word is null ");
	}

}
