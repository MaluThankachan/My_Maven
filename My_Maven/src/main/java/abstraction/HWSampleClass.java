package abstraction;

public class HWSampleClass extends HWAbstractClass
{

	//abstraction
	@Override
	public  void student(String name , int age)
	{
		System.out.println("The Student name and age is " + name + " , " + age);
	}
	//constructor
	HWSampleClass()
	{
		//super();
		System.out.println("This is sample class constructor" );
	}
	//method in child class
	public void sample()
	{
		System.out.println("This is a method of sample class");
		//super.normalmethod();
	}
	public static void main(String[] args)
	{
		
		HWSampleClass hw = new HWSampleClass(); //automatically calls parent nd child constructor also
		hw.student("Anu",23);
		HWSampleClass.abstractstatic();//static method classname
		hw.normalmethod(); //normal method object
		hw.sample();
		
		
		

	}

}
