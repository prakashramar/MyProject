package tasks;

import java.util.Scanner;

public class SwappingWOVariable 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is :" + b);
		
		 
		 
	}
}
