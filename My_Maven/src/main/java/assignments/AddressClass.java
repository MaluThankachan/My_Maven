//Write a program to get the details of a Student 


package assignments;

public class AddressClass 
{
	String stdaddress = "XYZ, Ernakulam, 682314";
	
	public static void main(String[] args) 
	{
		StudentDetails sd = new StudentDetails();
		AddressClass ad = new AddressClass();
		System.out.println("The STUDENT DETAILS IS :- \n");
		System.out.println("The name of student is "+ sd.stdname + " \nThe rollno of " + sd.stdname + " is " + sd.rollno + "\nThe address of " +sd.stdname + " is " +"\n" + ad.stdaddress);

	}

}
