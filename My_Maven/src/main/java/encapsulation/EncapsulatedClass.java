package encapsulation;

public class EncapsulatedClass 
{
	 private  String username ;
	 private int age;
	 //to access this variables we should use public setter methods
	 public void setter(String username, int age)
	 {
		this.username = username;
		this.age =  age;
	 }
	//to print this variables we should use public getter  methods
	 public void getter()
	 {
		age = age *2;
		 System.out.println("The username is " + username);
		System.out.println("The age is " + age);
	 }
	

}
