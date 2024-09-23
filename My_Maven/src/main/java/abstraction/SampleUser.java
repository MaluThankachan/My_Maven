package abstraction;

public class SampleUser extends AbstractClass
{

	
	public void sampleprint()
	{
		System.out.println("This is sampleuser class method");
	}
	@Override
	public void print()
	{
		System.out.println("Values to pass abstract class");
	}
	public static void main(String[] args)
	{
		SampleUser su = new SampleUser();
		
		su.sampleprint();
		su.print();
		su.display();

	}

}
