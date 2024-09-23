package polymorphism;

public class ClassChild extends ClassParent
{
	@Override //to show overriding is happening

	public void sameMethod()
	{
		super.sameMethod();// to get parent class method
		System.out.println("Child class Method");
	}
	public static void main(String[] args)
	{
		ClassChild cc = new ClassChild();
		cc.sameMethod();
		//to get parent class method
		ClassParent cp = new ClassParent();
		cp.sameMethod();

	}

}
