package polymorphism;

public class AssignmentCollegeDetails extends AssignmentStudentDetails
{
	@Override
	public void details(String name, int year, String dept, String Hod)
	{
		System.out.println("The details of college is " +"\033[1m"+name+"\033[0m"+ ", " + "\033[1m Year " +year +"\033[0m" + ", " + "\033[1m" +dept + "\033[0m" + ", " + "\033[1m" +Hod + "."+"\033[0m");
		//if we want to get parent method then either use super or create parent object
		//super.details("Anu", 20, "ComputerScience", "Female");
	}
	public static void main(String[] args) 
	{
		AssignmentCollegeDetails cd = new AssignmentCollegeDetails();
		cd.details("College Name - St.therasas", 2024, "Department - ComputerScience", "HOD - Riya");

	}

}
