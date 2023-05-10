package Praveen9thMay;
// Car and Price
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {

	public static void main(String args[]){  

		TreeMap<String,String> car=new TreeMap<String,String>();    
		car.put("hyundai", "15 Lakh");    
		car.put("suzuki ",  "12 Lakh");    
		car.put("tata   ",  "10 Lakh");    
		car.put("honda  ",  "16 Lakh");    

		for(Map.Entry m: car.entrySet()){  

			System.out.println(m.getKey()+" "+m.getValue());  

		}    
	}


}
