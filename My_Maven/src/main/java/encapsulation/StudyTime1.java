package encapsulation;

public class StudyTime1 
{
	private String username;
	private String pwd;
	public void setter(String username, String pwd)
	{
		this.username = username;//anu
		this.pwd = pwd;//anu123
	}
	public void getter()
	{
		System.out.println(username);
		System.out.println(pwd);
	}
	

}
