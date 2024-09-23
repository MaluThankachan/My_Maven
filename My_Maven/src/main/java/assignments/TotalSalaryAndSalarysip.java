//Program to find the total salary by hand of an Employee 
package assignments;

public class TotalSalaryAndSalarysip extends HraAndPF
{
	float total_salary = basicpay+hra-pf-deduction+bonus;
	//Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip • 
	//Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary
	
	public static void main(String[] args) 
	{
		TotalSalaryAndSalarysip ts = new TotalSalaryAndSalarysip();
		System.out.println("Your total salary is \n" + "\033[1m" + ts.total_salary +"\033[0m");
		System.out.println("Your Salary slip " + "\n HRA =" +"\033[1m" + ts.hra + "\033[0m" +"\n PF ="+"\033[1m" + ts.pf + "\033[0m" + "\n Bonus =" +"\033[1m"+ ts.bonus + "\033[0m" +"\n Total Salary ="+ "\033[1m" +ts.total_salary +"\033[0m" );

	}
	
}
