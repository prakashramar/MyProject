package array;
import java.util.Arrays;
import java.util.Scanner;

public class FindSameArrayValue 
{

	public static void main(String[] args) 
	{
		int count=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array One : ");
		int n=s.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("value of array One :");
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the size of array Two : ");
		int n1=s.nextInt();

		int b[]=new int[n1];
		for(int j=0;j<n1;j++)
		{
			System.out.println("value of array Two :");
			b[j]=s.nextInt();
		}
		System.out.println(Arrays.toString(b));
		
		
		if(a.length==b.length)
		{	
			
			for(int k=0;k<n;k++)
			{
				for(int l=0;l<n;l++)
				{
					if(a[k]==b[l])
						{
							count++;
						}
				}
			}
		if(count==n)
		{
			System.out.println("Arrays are Same");
		}
		else if(count!=n)
		{
			System.out.println("Arrays are NOT Same");
		}
		}
		else
		{
			System.out.println("Arrays Length NOT match");
		}
		
		
	}

}
