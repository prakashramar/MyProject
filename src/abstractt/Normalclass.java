package abstractt;

interface I
{
	
	public void add();
	public int sub();
	
}

class A implements I
{

	int a=4;
	int b=2;
	public int mul()
	{
		int m=a*b;
		return m;
	}
	public void div()
	{
		int d=a/b;
		System.out.println("Div : "+d);

		
	}
	@Override
	public void add()
	{
		int c=a+b;
		System.out.println("Add : "+c);

	}
	@Override
	public int sub() 
	{
		int s=a-b;
		return s;	
	}
	
}


class B extends A
{
	public String name()
	{
		String n="Prakash";
		return n;
	}

}
class Normalclass 
{

	public static void main(String[] args) 
	{
		B b=new B();
		
		b.add();
		
		int b2=b.sub();
		System.out.println("Sub : "+b2);
		
		int b3=b.mul();
		System.out.println("Mul : "+b3);
		
		b.div();
	
		
		String n1=b.name();
		System.out.println("String Nmae : "+n1);
		
		
	}

}
