package Praveen4thMay;

public class Shape_$square extends Shape_$rectangle
{
	public void showshape()
	{
		System.out.println("square is also rectangle of all 4 sides equals");
	}
	
	public static void main(String[] args)
	{
		Shape_$square robj = new Shape_$square();
		
		  robj.shapeshow();
		  robj.showshape();

	}
	
}