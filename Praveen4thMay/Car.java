package Praveen4thMay;
//2.try to create a default constructor and a parameterised constructor and use it in your class

public class Car
{
	String color;
	int wheels;
	
	//
	public Car()      //these are default construtor / / if we not passing any values these details will give output
	{
		this.color="white";
		this.wheels=4;
	}  
	//
	
	public Car(String color)   //parameterised constructor // also here Constructor Overloading is happening
	{
		this.color=color;
	}

	public static void main(String[] args) 
	{
		
		Car obj = new Car();      //creating 1st object
		
		System.out.println(obj.color);  
		System.out.println(obj.wheels); 
		
		System.out.println("-----audi------");
		
		Car audi = new Car();       //creating 2nd object
		audi.color="BLack";
		
		System.out.println(audi.color);
		System.out.println(audi.wheels);
		
		System.out.println("-----mercerdies------");
		
		Car mercerdies= new Car();      //creating 3rd object
		mercerdies.wheels=6;
		
		System.out.println(mercerdies.color);
		System.out.println(mercerdies.wheels);
		
		System.out.println("-----bmw------");  
		Car bmw = new Car();					//creating 4th object
		System.out.println(bmw.color);
		System.out.println(bmw.wheels);
		
		
		System.out.println("-----Tesla-----");  
		
		Car tesla = new Car("purple");
		
		System.out.println(tesla.color);   //purple
		System.out.println(tesla.wheels);  //

	}

}
