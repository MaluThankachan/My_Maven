package AccessModifiers;

public class Class1 
{
	public void publicprintClass1()
	{
		System.out.println("Public method of Class1");
	}
	private void privateMethodClass1()
	{
		System.out.println("Private method of Class1");
	}
	protected void protectedMethodClass1()
	{
		System.out.println("Protected method of Class1");

	}
	 void defaultMethodClass1()
	{
		System.out.println("Default method of class1");
	}

	public static void main(String[] args) 
	{

		Class1 c1 = new Class1();
		c1.publicprintClass1();
		c1.privateMethodClass1();
		c1.protectedMethodClass1();
		c1.defaultMethodClass1();
	}

}
