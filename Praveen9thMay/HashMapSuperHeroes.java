package Praveen9thMay;
// Write a program to add elements to the HashMap given the key and value data type is String?Hint: 
// create a map with superhero id and superheronames

import java.util.HashMap;
import java.util.Map;

public class HashMapSuperHeroes {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> superHeroes$ = new HashMap();
		
		superHeroes$.put(10001,"BatMan");
		superHeroes$.put(10002,"SuperMan");
		superHeroes$.put(10003,"SpiderMan");
		superHeroes$.put(10004,"Hulk");
		superHeroes$.put(10007,"IronMan");
		superHeroes$.put(10008,"CaptainAmerican");
		
		System.out.println("values = "+superHeroes$);
		
		
        for (Map.Entry<Integer,String > entry : superHeroes$.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        
        
        System.out.print("Size of the set is>>>");
        System.out.println(superHeroes$.size());
		
        
        //How to check if HashMap is empty?
        System.out.print("check whether HashMap is ..\n empty or Not (T/F) >>>");
        System.out.println(superHeroes$.isEmpty());
        
	}

}

//Write a program to get size of HashMap?(USE READYMADE METHODS)
//How to check if HashMap is empty?
