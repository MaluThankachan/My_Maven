package exception;

public class ExceptionHandling1Arithmetic
{

	int a =10;
	public void divide()
	{
		try //to insert exception code
		{
		int d = a/0;
		System.out.println(d);
		}
		catch(Exception e) //used to handle exception occured in try statements.
		{
			System.out.println("Exception Handled");
			System.out.println(e);

		}
		finally // it will exceute always eventhough exception is handled or not
		{
			System.out.println("Finalyy Block");
		}
	}

	public static void main(String[] args) 
	{
		
		ExceptionHandling1Arithmetic ae = new ExceptionHandling1Arithmetic();
		ae.divide();//since exception is handled the below statemnet get exceuted
		System.out.println("End of statement");

	}
}
