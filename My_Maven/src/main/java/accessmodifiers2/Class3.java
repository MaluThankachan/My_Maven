package accessmodifiers2;

import AccessModifiers.Class1;

public class Class3 
{
	

	public static void main(String[] args)
	{
		Class1 c1 = new Class1();
		c1.publicprintClass1();
		//c1.privateMethodClass1(); not possible since within the same package with private not possible
		//c1.protectedMethodClass1(); outside the package the protected method not accessible
		//c1.defaultMethodClass1();outside the package the default method not accessible
	}

}
