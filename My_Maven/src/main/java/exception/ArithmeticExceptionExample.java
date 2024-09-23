package exception;

public class ArithmeticExceptionExample {
	
	int a =10;
	public void divide()
	{
		int d = a/0;
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		
		ArithmeticExceptionExample ae = new ArithmeticExceptionExample();
		ae.divide();

	}

}
