package Praveen4thMay;
//Write a program to print the names of students by creating a Student class. If no name is passed 
// while creating an object of Student class, then the name should be "Unknown", otherwise the name 
// should be equal to the String value passed while creating object of Student class.

public class Student_1 
{
	String studentname;
	int srollno;
	double percentage;
	String schoolname;
	
	public Student_1()                   //Default Constructor
	{
		this.studentname="Unknown";
		this.srollno=0;
		this.percentage=0;
		this.schoolname="DPS";
		
	}
	
	public Student_1(String studentname,int srollno,double percentage,String schoolname)   //Parameterised Constructor
	{
		if(studentname==null)             //IF Student name is Null 
		{
			this.studentname=studentname="UNKNOWN";        //mention as a UNKNOWN
		}
		else
		{	
			this.studentname=studentname;
			this.srollno=srollno;
			this.percentage=percentage;
			this.schoolname=schoolname;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		Student_1 raj = new Student_1();            //creating of 1st OBJECT for STudent Class
		
			  raj.studentname="RAJ VERMA";
			  raj.srollno=24;
			  raj.percentage=75.50;
			//  raj.schoolname="APS";
			  
			  System.out.println("Student name = "+raj.studentname+" \nStudent rollno :"+raj.srollno);
			  System.out.println("Student percentage = "+raj.percentage+"\nSchool name = "+raj.schoolname);
		
		  System.out.println("----------------------------");
		
		Student_1 pk = new Student_1();              //creating of 2nd OBJECT for Student Class
			
			 pk.studentname="PRAVEEN KUMAR";
			 pk.srollno=32;
			 pk.percentage=68.25;
			 pk.schoolname="KV NRC";
			 
			 System.out.println("Student name = "+pk.studentname+" \nStudent rollno :"+pk.srollno);
			  System.out.println("Student percentage = "+pk.percentage+"\nSchool name = "+pk.schoolname);
		
			 
		 System.out.println("----------------------------");
		 
			 Student_1 unk = new Student_1();
			 
			 System.out.println("Student name = "+unk.studentname+" \nStudent rollno :"+unk.srollno);
			 System.out.println("Student percentage = "+unk.percentage+"\nSchool name = "+unk.schoolname);
		
		System.out.println("----------------------------");
		
			Student_1 vij = new Student_1("Vijay Singh",66,82.40,"");
			
			 System.out.println("Student name = "+vij.studentname+" \nStudent rollno :"+vij.srollno);
			 System.out.println("Student percentage = "+vij.percentage+"\nSchool name = "+vij.schoolname);
			 
	    System.out.println("----------------------------");
				
				Student_1 mo = new Student_1(null,66,82.40,"");
				
			System.out.println("Student name = "+mo.studentname+" \nStudent rollno :"+mo.srollno);
		    System.out.println("Student percentage = "+mo.percentage+"\nSchool name = "+mo.schoolname);
		
	}

}
