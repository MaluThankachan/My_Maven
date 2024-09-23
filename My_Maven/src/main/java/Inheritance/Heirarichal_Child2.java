package Inheritance;

public class Heirarichal_Child2 extends Heirarcihal_Parent
{
	public void sub()
	{
		System.out.println("The Child2 subtraction is "+ (a-b));
	}
	public static void main(String[] args) 
	{
		Heirarichal_Child2 hc2 = new Heirarichal_Child2();
		hc2.sub();
		hc2.add();// parent class
	}

}
