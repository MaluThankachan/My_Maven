package AccessModifiers;

public class Class2 {
	

	public static void main(String[] args)
	{
		Class1 c1 = new Class1();
		c1.publicprintClass1();
	//	c1.privateMethodClass1(); not possible since within the same package with private not possible
		c1.protectedMethodClass1();
		c1.defaultMethodClass1();
		
	}

}
