package tasks;
import java.util.Scanner;
public class Swapping
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		System.out.println("Enter the value of b");
		 int b=s.nextInt();
		
		 int c=a;
		 int d=b;
		
			
		if(c==a && d==b)
		{
			System.out.println("the value of a is :" + b);
			System.out.println("the value of b is :" + a);
		}
		
	}

}
