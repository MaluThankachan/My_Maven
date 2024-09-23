package Inheritance;

public class Car_Details_Child extends Employee_Details{
	
	String carname ="Ford";
	int model = 123;
	String regno ="KL072017";
	public void displayCarDetails()
	{
		System.out.println("The car details is " + carname +", " + model +", " + regno);
	}

	public static void main(String[] args) {
		Car_Details_Child cd = new Car_Details_Child();
		cd.displayCarDetails();
		cd.displayEmployee();
		cd.displayStudent();

	}

}
