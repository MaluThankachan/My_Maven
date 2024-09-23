package Inheritance;

public class SuperParentExample2 {
	String s = "Varibale in Parent";
	public SuperParentExample2(int age, String name)
	{
		System.out.println("This is parent constructor called from child class constructor with values \n" +"\033[1m"+name+" ," + age+"\033[0m " );
	}
	public int add(int a, int b)
	{
		System.out.println("This is parent class method called frm child class method with sum = ");
		return   (a+b);
	}

}
