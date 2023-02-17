package practice;
import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c;
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of A");
		int z=s.nextInt();
		
		for(int i=0;i<=z;i++)
		{
			
			c=a;
			b=c;
			c=b+a;
			
			System.out.println(c);
		}
		

	}

}
