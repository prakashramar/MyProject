package practice;
import java.util.Scanner;
public class Methods 
{
	
	int a;
	int b;
	public static void main(String [] args)
	{
		Methods m=new Methods();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		m.a=s.nextInt();
		
		System.out.println("Enter the value of b");
		m.b=s.nextInt();
		
		Methods1 z=new Methods1();
		int w=z.add();
		System.out.println("addition is :" + w);
		int r=z.sub();
		System.out.println("Subtraction is :" + r);
	}
}
