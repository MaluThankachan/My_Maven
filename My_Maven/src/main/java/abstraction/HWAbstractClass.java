package abstraction;

public abstract class HWAbstractClass 
{
	
	public abstract void student(String name, int age);
	HWAbstractClass()
	{
		System.out.println("This is abstract class constructor");
	}
	public static void abstractstatic()
	{
		System.out.println("This is static method in abstract class");
	}
	public void normalmethod()
	{
		System.out.println("This is a instance method of abstract class");
		
	}
}
