package encapsulation;

public class StudyTimeEmpEncapsulationClass
{
	private int bonus = 5000;
	private int salary;
	private String empname;
	public void setter(String empname, int  salary)
	{
		this.empname = empname;
		this.salary = salary;
	}
	public void  getter()
	{
		salary = salary +bonus;
		System.out.println(salary);
	}
}
