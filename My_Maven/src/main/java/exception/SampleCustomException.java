package exception;

public class SampleCustomException 
{
	
	public void test(int age)  throws LicenseException1
	{
		if(age<18)
		{
			throw new LicenseException1("Not Eligible for voting"); //user created exception
			
			
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) throws LicenseException1 
	{
		SampleCustomException sc = new SampleCustomException();
		sc.test(87);

	}

}
