package Inheritance;

public class SuperChild extends SuperParent
{
	public  SuperChild()
	{
		super("ANU",19);
		System.out.println("This is superchild class constructor");
	}
	public void displayChild()
	{
		
		System.out.println("The Super parent name variable is " + super.name);
		System.out.println("The Super parent age variable is " + super.age);
		super.displayParent();
		System.out.println("This is Super child class method");
	}

	public static void main(String[] args) 
	{
		SuperChild sc = new SuperChild();
		sc.displayChild();

	}

}
