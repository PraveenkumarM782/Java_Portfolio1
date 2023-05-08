package Praveen5thMay;

public class BA_Monkey implements BA_BasicAnimal{
	
	public void jump()
	{
		System.out.println(" Monkey jump very high in between trees..");
	}
	
	public void bite()
	{
		System.out.println(" The bite force of Monkey is very Strong...");
	}

	@Override
	public void Eat() {
		System.out.println(" Monkey likes to eats specially banana");
		
	}

	@Override
	public void sleep() {
		System.out.println(" Monkey likes to sleep at trees and cliff");
		
	}
	
}

