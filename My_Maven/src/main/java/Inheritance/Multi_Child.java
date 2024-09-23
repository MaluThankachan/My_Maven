package Inheritance;

public class Multi_Child extends Multi_Parent
{
	
	public void mult()
	{
		System.out.println("The Multiplication child is "+ (a*b));
	}

	public static void main(String[] args) 
	{
		Multi_Child mc = new Multi_Child();
		mc.mult();
		mc.sub();
		mc.add();
		

	}

}
