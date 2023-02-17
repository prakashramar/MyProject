package array;
import java.util.Scanner;
public class FindIndexValueOfArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
	
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the values");
			a[i]=s.nextInt();
		}
		
		//int a[]= {10,12,20,30,25,40,32,31,35,50,60};
		
		for(int i=1;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}