//• Program to check the addition result is divisible by 10 

package assignments;

public class CheckAddResult extends ReturnAdditionResult
{
	float result;
	public void check()
	{
		result = super.add(10,35);
		System.out.println("The addition result is " +result);
		if(result % 10 == 0)
		{
			System.out.println("The " + result + " is divisible by 10");
		}
		else
		{
			System.out.println("The " + result + " is not divisible by 10");

		}
		
		
	}
	public static void main(String[] args)
	{
		CheckAddResult c = new CheckAddResult();
		c.check();
		

	}

}
