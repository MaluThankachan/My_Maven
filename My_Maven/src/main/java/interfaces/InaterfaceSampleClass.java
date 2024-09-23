package interfaces;

public class InaterfaceSampleClass implements InterfaceSample1
{
	public void add()
	{
		System.out.println("The add is " + (a+b));
	}
	public void display()
	{
		System.out.println("Abstract Method 1");

	}
	public void classmethod()

	{
		System.out.println("This is class method");
	}
	public static void main(String[] args)
	{
		InaterfaceSampleClass i = new InaterfaceSampleClass();
		i.add();
		i.display();
		i.classmethod();

	}

}
