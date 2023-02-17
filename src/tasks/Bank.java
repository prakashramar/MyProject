package tasks;

abstract class Bang
{
	public abstract void getBalance();
}
class BangA extends Bang
{
	public void getBalance()
	{
		System.out.println("$100");
	}
}
class BangB extends Bang
{
	public void getBalance()
	{
		System.out.println("$150");
	}
}
class BangC extends Bang
{
	public void getBalance()
	{
		System.out.println("$200");
	}
}


public class Bank 
{

	public static void main(String[] args) 
	{
		BangA obj1=new BangA();
		obj1.getBalance();
		
		BangB obj2=new BangB();
		obj2.getBalance();
		
		BangC obj3=new BangC();
		obj3.getBalance();
	}
}
