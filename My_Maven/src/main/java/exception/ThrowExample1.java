package exception;

public class ThrowExample1
{
	public static void test(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");
			//System.out.println("Not Eligible for voting");
			
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args) 
	{
		ThrowExample1.test(14);

	}

}
