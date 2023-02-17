package polymorphism;

class Inte
{
	public void inte()
	{
		System.out.println("invalid");
	}
	
	public void inte(int a)
	{
		System.out.println(a);
	}
	
	public void inte(int a,int b)
	{
		System.out.println(a +" "+b);
	}
	
	public void inte(String b)
	{
		System.out.println(b);
	}
}


public class Printnum 
{
	public static void main(String[] args) 
	{
		Inte i=new Inte();
		i.inte();
		i.inte(5);
		i.inte(7,2);
		i.inte("Prakash");
		
		
	}

}
