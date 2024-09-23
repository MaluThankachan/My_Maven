package abstraction;

public class SampleCalcClass extends SampleAbstractCalc
{
	public void calc(int a, int b)
	{
		System.out.println("The addition is " + (a+b));
		System.out.println("The subtraction is " + (a-b));
		System.out.println("The multiplication is " + (a*b));
		System.out.println("The division is " + (a/b));

	}
	public static void main(String[] args)
	{
		SampleCalcClass sc = new SampleCalcClass();
		sc.calc(50, 10);

	}

}
