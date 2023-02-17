package practice;

import java.util.Scanner;

public class Evennumbersbyfive 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		for(int i=0;i<a;i++)
		{
			int z=i%5;
			if(z==0)
			{
				int y=i%2;
				if(y==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
