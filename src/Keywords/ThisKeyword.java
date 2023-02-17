package Keywords;

public class ThisKeyword 
{
	int a=5;
	int b=10;
	public static void main(String[] args) 
	{
		ThisKeyword obj=new ThisKeyword(6);
		obj.add(10,5);
		
	}
	public void add()
	{
		
		int c=15;
		this.a=c;
		System.out.println("Str");
	}
	public void add(int a,int b)
	{
		this.add();
		System.out.println(a);
	}
	ThisKeyword()
	{
		this(5);
		System.out.println("hjf");
	}
	ThisKeyword(int c)
	{
	
		System.out.println("gf");
	}
}

