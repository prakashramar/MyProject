package array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoD 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array size 1");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		
		System.out.println("Enter Array size 2");
		int n1=s.nextInt();
		int b[][]=new int[n1][n1];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			System.out.println("Enter the value of array");
			a[i][j]=s.nextInt();
			}	
		}
		

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			System.out.println("Enter the value of array");
			b[i][j]=s.nextInt();
			}	
		}
		
	}

}
