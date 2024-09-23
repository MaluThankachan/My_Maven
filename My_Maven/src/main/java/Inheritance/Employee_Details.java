package Inheritance;

public class Employee_Details extends Student_Details
{
	String name ="Reenu";
	int age = 34;
	String gender ="Female";
	String position = "Engineer";
	public void displayEmployee() 
	{
		System.out.println("The Employee Details is " + name +" ,"  + age +" ," +gender +" ," + position);
	}

}
