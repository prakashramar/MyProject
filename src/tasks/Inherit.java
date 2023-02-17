package tasks;

class head
{
	String a="This is the Parent Class";
	public void parent()
	{
		System.out.print(a);
	}
}

class senior extends head
{
	String b="This is the Child  Class";
	public void child()
	{
		System.out.print(b);
	}
}


public class Inherit 
{

	public static void main(String[] args) 
	{
	
		head hh=new head();
		String a1=hh.a;
		System.out.println(a1);
		
		senior ss=new senior();
		String b1=ss.b;
		System.out.println(b1);
		
		senior s1=new senior();
		String s2=s1.a;
		System.out.println(s2);
		
		
	}

}
