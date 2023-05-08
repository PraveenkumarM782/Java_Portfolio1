package Praveen5thMay;
//Case :1 using default constructor 


class Animal2{
	//default or no-arg constructor of class Animal
	
	Animal2(){
		System.out.println("I am an animal ");
	}
	
}

class Dog extends Animal2{
	//default or no-arg constructor of class Dog
	
	Dog(){
		
		super();  //calling default constructor of the superclass
		System.out.println("I am a dog");
	}
}
public class Dog_Animal {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
	}
}
