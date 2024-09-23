package Inheritance;

public class SuperChildExample2 extends SuperParentExample2
{
	public SuperChildExample2()
	{
		super(20,"Divya");
		System.out.println("This is a parent class variable called from child class \n"+"\033[1m"+super.s+"\033[0m ");

	}
	public int sub(int a , int b)
	{
		System.out.println("\033[1m"+super.add(20,10)+"\033[0m ");
		System.out.println("This is child class method  with sub =");
		return   (a-b);
	}
	
	public static void main(String[] args) {
		SuperChildExample2 sc = new SuperChildExample2();
		System.out.println("\033[1m"+sc.sub(20,10)+"\033[0m ");
	}

}
