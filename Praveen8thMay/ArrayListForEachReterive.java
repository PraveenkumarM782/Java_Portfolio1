package Praveen8thMay;
//Write a program to traverse (or iterate) ArrayList using for each loop
import java.util.ArrayList;

public class ArrayListForEachReterive {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("dosa");
		al.add('A');
		al.add(45.50);
		al.add(null);
		al.add("Praveen");
		al.add(false);
		
		//using for each loop iterate or traverse the elements..
		
		for(Object x: al)
		{
			System.out.println(x);
		}
		
	}

}
