package practice;

import java.util.Scanner;

public class YesorNo 
{

	
	
	public static void main(String[] args) 
	{
		String m,m1;
		
		Scanner s=new Scanner(System.in);
		
		do
		{
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Do u want to add Yes or No ");
		m=s.nextLine();
		m1=s.nextLine();
		}
		while(m1.equals("Yes"));
		
		System.out.println("Process Stopped");
	}

}
