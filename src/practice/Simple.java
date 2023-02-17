package practice;

public class Simple 
{
	public static void main(String []args)
	{
		int a,b,c;
		a=10;b=4;
		c=a+b;
		System.out.println(c);
		
		Simple obj=new Simple();
		System.out.println(obj.mul());
		
	}
	public int mul()
	{
		int a1,b1,c1;
		a1=15;b1=10;
		c1=a1*b1;
		System.out.println(c1);
		return 5;
		
	}
}
