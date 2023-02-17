package array;
import java.util.Scanner;

public class DisplayNumbersBelow5 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=s.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number : ");
			a[i]=s.nextInt();
		}
			System.out.println("Enter the Search Element : ");
			int m=s.nextInt();
			for(int i=0;i<n;i++)
			{
				if(a[i]<m)
				{
					System.out.println("Below Search value : "+a[i]);	
					b[i]= a[i];
				}
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
	}

}
