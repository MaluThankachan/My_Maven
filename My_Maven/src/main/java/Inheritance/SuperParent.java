package Inheritance;

public class SuperParent {
	String name = "Meera";
	int age = 18;
	public SuperParent(String name , int age)
	{
		System.out.println("This is Super parent constructor with  " + name + " ," + age);
	}
	public void displayParent()
	{
		System.out.println("This is Super parent class method");
	}

}
