package array;
import java.util.Scanner;

public class FindTheValue 
{

	public static void main(String[] args) 
	{
		boolean ans=false;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=s.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value : ");
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the Find value : ");
		int f=s.nextInt();
		
		
		for(int j=0;j<n;j++)
		{
			ans=a[j]==f;	
		}
			if(ans==true)
			{
				System.out.println("Value is Present");
			}
			else if(ans==false)
			{
				System.out.println("Value is not Present");
			}
		}

}
