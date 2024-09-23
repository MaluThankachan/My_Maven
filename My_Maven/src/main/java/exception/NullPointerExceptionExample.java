package exception;

public class NullPointerExceptionExample 
{
	String a = null ;
	public void lengthstr()
	{
		System.out.println(a.length());
	}
	public static void main(String[] args)
	{
		NullPointerExceptionExample npe = new NullPointerExceptionExample();
		npe.lengthstr();

	}

}
