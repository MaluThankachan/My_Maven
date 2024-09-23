package exception;

public class ExceptionHandling2NullPointer 
{
	static String a = null;
	public static void test()
	{
		try
		{
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer Exception Hndled");
		}
		finally
		{
			System.out.println("This will exceute always evne error occured or not");
		}
	}
	public static void main(String[] args) 
	{
		ExceptionHandling2NullPointer.test();

	}

}
