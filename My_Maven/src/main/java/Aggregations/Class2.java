package Aggregations;

public class Class2 
{
	public void sub()
	{
		int a = 20;
		int b =10;
		System.out.println("The sub is " + (a-b));
	}

	public static void main(String[] args)
	{
		//We need to get method of class 1 to class 2 without inheritance ,using aggregation
		
		Class1 c1 = new Class1(); // for this we create object of previous class in current class.This is aggregations 
		c1.add();
		Class2 c2 = new Class2();
		c2.sub();

	}

}
