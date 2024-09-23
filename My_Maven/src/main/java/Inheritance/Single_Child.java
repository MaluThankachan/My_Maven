package Inheritance;

public class Single_Child extends Single_Parent
{
	public void display()
	{
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_Child sc = new Single_Child();
		sc.display();
		sc.print();
		System.out.println(sc.a);
		System.out.println(sc.b);


	}

}
