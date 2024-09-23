package Inheritance;

public class Heirarichal_Child1 extends Heirarcihal_Parent
{
	public void mult()
	{
		System.out.println("The Child1 multiplication is " + (a*b));
	}

	public static void main(String[] args) {
		Heirarichal_Child1 hc1 = new Heirarichal_Child1();
		hc1.mult();
		hc1.add(); // parent class
		

	}

}
