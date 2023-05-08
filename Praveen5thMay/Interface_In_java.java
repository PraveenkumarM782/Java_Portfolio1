package Praveen5thMay;

public class Interface_In_java implements Student {
	int x;
	public void name()
	{
		System.out.println(x+"Name - Aditya ");
	}
	public static void main(String args[])
	{
		Interface_In_java ij = new Interface_In_java();
		ij.name();
	}
}
