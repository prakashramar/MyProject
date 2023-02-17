package polymorphism;

class printt
{
	public void printt(int n,char a)
	{
		System.out.print(n);
		System.out.println(a);
	}
	
	public void printt(char a,int n)
	{
		System.out.print(a);
		System.out.println(n);

	}

}

public class Printint 
{

	public static void main(String[] args) 
	{
		printt p=new printt();
		p.printt(5,'s');
		p.printt('s',5);
		
	}

}
