package accessmodifiers2;

import AccessModifiers.Class1;

public class Class4 extends Class1
{

	public static void main(String[] args) 
	{
		Class4 c4 = new Class4();
		c4.publicprintClass1();
		//c4.privateMethodClass1(); not possible since within the same package with private not possible
		c4.protectedMethodClass1();
		//c4.defaultMethodClass1(); not accessible outside with subclass for default
	}

}
