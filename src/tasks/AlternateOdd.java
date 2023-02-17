package tasks;

import java.util.Scanner;

public class AlternateOdd 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the ODD Number :");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i=i+4)
		{
			if(i%2==1)
			{
				System.out.println(i); 
			}
		}

	}

}
