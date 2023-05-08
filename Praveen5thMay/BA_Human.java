package Praveen5thMay;

public class BA_Human  extends BA_Monkey implements BA_BasicAnimal
{

	@Override
	public void Eat() {	
		System.out.println(" Human can only animal who can eats with hands and spoons ");	
	}

	@Override
	public void sleep() {
		System.out.println(" Human sleep inside House only..");
	}
	
	public void  jump(){
		System.out.println(" human can't jump more than 2 metre high ..");
	}
	
	public void bite(){
		System.out.println(" human bite force is very less compare to Wild animals..");
	}
	
	
	public static void main(String[] args) {
		BA_Human  bobj = new BA_Human();
		
		bobj.Eat();
		bobj.sleep();
		bobj.jump();
		bobj.bite();
		
		System.out.println("-----------------");
		
		BA_Monkey mobj = new BA_Monkey();
		mobj.bite();
		mobj.jump();
		mobj.Eat();
		mobj.sleep();
		
		
	}

}
