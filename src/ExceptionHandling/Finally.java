package ExceptionHandling;

public class Finally {

	public static void main(String[] args) 
	{
		try
		{

			int a,b,c;
			a=10; 
			b=0;
			c=a/b;
			/*int d[]= {10,20,30};
			System.out.println(d[7]);
			System.out.println(c);*/
		}
		catch (ArithmeticException e1) 
		{
			System.out.println(e1);
		}
		finally
		{
			System.out.println("Final value");
		}
	}

}
