package interfaces;

public interface InterfaceSample1
{
	public static final int a = 10;
	int b = 20; // here also automatically compiler converts into static final 
	public void add(); // here also automatically compiler converts the normal method to abstract
	public abstract void display();
	
	
	
}
