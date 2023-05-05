package Praveen4thMay;

public class CalculateAreaNperimeter 
{
	 public void area(float x)   //area of square     ,overloaded method
	    {
		   System.out.println("Area of Square is ..:");
	        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	    }
	 
	  public void area(float x, float y)  //area of rectangle   ,overloaded method
	    {
		  System.out.println("Area of Rectangle is...:");
		  System.out.println("the area of the rectangle is "+x*y+" sq units");
	    }
	  
	   public void area(double x)       //area of circle  ,overloaded method
	    {
	        double z = 3.14 * x * x;
	        
	        System.out.println("Area of circle is...:");
	        System.out.println("the area of the circle is "+z+" sq units");
	    }
	   
	   
	    
	   public void perimeter(double s) 
	   {
	        double p = 4 * s;
	        
	        System.out.println("Perimeter of Square is : "+p);
	        
	    }
	    
	    public void perimeter(double l, double b)
	    {
	        double q = 2 * (l + b);
	        System.out.println("perimeter of  rectangle : "+q);
	    }
	    
	    //c=2 ,pi=3.14, r= radius
	    public void perimeter(int c, double pi, double r) 
	    {
	        double T = c * pi* r;
	        System.out.println("perimeter of circle is : "+T);
	    }
	
	public static void main(String[] args) 
	{
		 
		 CalculateAreaNperimeter  arobj = new CalculateAreaNperimeter();
		 
		   arobj.area(6);
		   arobj.area(5,4);
		   arobj.area(2.5);
		   
		   System.out.println("-----------------------------------");
		   
		   arobj.perimeter(6);
		   arobj.perimeter(5,4);
		   arobj.perimeter(2,3.14,6.2 );  //6.2 is radius
		
	}

}
