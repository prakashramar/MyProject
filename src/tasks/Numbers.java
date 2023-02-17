package tasks;

class PrintNumber
{
	public void printn(int a)
	{
		System.out.println(a);
	}
	public void printn(String b)
	{
		System.out.println(b);
	}
	public void printn(char c)
	{
		System.out.println(c);
	}
	
}

public class Numbers {

	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		p.printn(123);
		p.printn("Rake");
		p.printn('p');
	}

}
