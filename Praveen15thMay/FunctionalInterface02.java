package Praveen15thMay;

import java.util.function.Consumer;

class Person
{
	private String name;
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

}


public class FunctionalInterface02 {
	
	public static void main(String[] args) {
		
		Person obj = new Person();
		
		Consumer<Person> setName = t->t.setName("play games");
		setName.accept(obj);
		
		System.out.println(obj.getName());
	}

}
