package Praveen4thMay;
//create a class named dog and have any fields like colour, age , cost anything.. and
// try creating atleast 2- 3 objects with name like germanshepherd, dalmation, anything

public class Dog
{
	String color;
	String breed;
	int age;          //in months
	int cost;
	
	public Dog()   //default constructor 
	{
		this.color="black";
		this.breed="foreigner";
		this.age=3;                   //3 months
		this.cost=15000;
	}
	
	public Dog(String color,String breed,int age,int cost)  //parametereised constructor also Constructor overloading
	{
		this.color=color;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("--------husky------------");
		Dog husky = new Dog();            //creating 1st object 
		
		husky.color="grey";
		husky.breed="Siberian";
		
		System.out.println(husky.color);
		System.out.println(husky.breed);
		System.out.println(husky.age);
		System.out.println(husky.cost);
		
		System.out.println("----------shihTzu -------------");
		
		Dog shihTzu = new Dog();                 //creating 2nd object
		
		shihTzu.color="goldernbrown";
		shihTzu.breed="tibet";
		shihTzu.age=5;
		shihTzu.cost=10000;
		
		System.out.println(shihTzu.color);
		System.out.println(shihTzu.breed);
		System.out.println(shihTzu.age);
		System.out.println(shihTzu.cost);
		
		System.out.println("---------  rottweiller --------------");
		
		Dog rottweiller = new Dog("White","american",4,20000);   //creating 3rd object
		
		System.out.println(rottweiller.color);
		System.out.println(rottweiller.breed);
		System.out.println(rottweiller.age);
		System.out.println(rottweiller.cost);
		
	}

}
