package practice;

import java.util.Scanner;

public class TwoTable 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			
			int b=a*i;
			System.out.println(i + "*12=" + b);
			
				
		}
		
	}

}
