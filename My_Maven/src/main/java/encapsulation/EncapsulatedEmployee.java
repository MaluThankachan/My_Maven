package encapsulation;

public class EncapsulatedEmployee 
{
	private String empname;
	private float salary;
	private float bonus = 5000.0f;
	public void setter(String empname, float salary) //ameya,35000
	{
		this.empname = empname;
		this.salary = salary;
	}
	public void getter()
	{
		salary = salary + bonus;
		System.out.println("The employee name is " +"\033[1m"+ empname + "\033[0m"+ " and " + "salary is " + "\033[1m" +salary +"\033[0m");
	}
}
