package inheritance;

class A
{
	int a=10;
	public void add()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=15;
	public void sub()
	{
		System.out.println(b);
	}
}
class C extends A
{
	int c=20;
	public void mul()
	{
		System.out.println(c);
	}
}

public class Multilevel 
{
	public static void main(String[] args) 
	{
		B cc=new B();
		int d=cc.a+cc.b;
		System.out.println(d);
	}

}
