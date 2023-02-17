package practice;


class valu
{
	int a,b;
	public void first()
	{
		System.out.println();
	}
}

class number extends valu
{
	int a=3;
	int b=2;
	public void second()
	{
		System.out.println();
	}
}

class letters extends number
{
	int c=a+b;
	int c1=a-b;
	public void third()
	{
		System.out.println();
	}
}
public class Values
{
	public static void main(String args [])
	{
		letters l=new letters();
		System.out.println(l.c);
		System.out.println(l.c1);
	}
}