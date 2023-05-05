package Praveen4thMay;
//single level inheritance
public class ClassB extends ClassA
{
	public String bike="Fz250";
	
	public void work()
	{
		System.out.println(" I will work less:");
	}
	public static void main(String[] args)
	{
		ClassA obj = new ClassA();
		obj.work();
		
		System.out.println("so as a son, i will inherit your property..");
		System.out.println(" Cash:"+obj.cash+"\n property 2:"+obj.Property1+"\n Property 3:"+obj.Property2+"\n Others :"+obj.Property3);
		
	}

}
