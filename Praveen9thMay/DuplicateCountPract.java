package Praveen9thMay;

import java.util.LinkedHashMap;

public class DuplicateCountPract {
	
	public static void main(String[] args) {
		
		String name = "PraveenKumar";

		char[] nameArray = name.toCharArray();   //writing in character array
		
		LinkedHashMap<Character,Integer> dataMap = new LinkedHashMap<Character,Integer>();
		
		for(int i = 0; i < nameArray.length-1;i++) {
			//check already present or not
			if(dataMap.containsKey(nameArray[i])) {
				
				//if it is already present -> increment the count
				dataMap.put(nameArray[i],dataMap.get(nameArray[i])+1);
				
			}
			else {
				//not present -> had the count as 1
				dataMap.put(nameArray[i],1);
			}
			
		}
		System.out.println(dataMap);

		
		

	}

		
	}


