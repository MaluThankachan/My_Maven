package finalkeyword;

public class FinalChild
//public class FinalChild extends FinalParent :- if parent is final then child can't be inherit
{
	final int b =10;
	int c =20;
//	public  void check() if parent has final method then child can't be overridden
	{
		//b = 50; since b is declared as final we can't change that value
		//c = 30;  here we can change since it is not final 
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
