package array;
import java.util.Scanner;
public class ModuleNumbers 
{
	public static void main(String []args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size :");
		int m=s.nextInt();
		
		int a[]=new int[m];
		
		for(int i=0;i<m;i++)
		{	
			
			System.out.println("Enter the value");
			a[i]=s.nextInt();
		}
		System.out.println("Enter the module value :");
		int b=s.nextInt();
		for(int j=0;j<m;j++)
		{
			if(a[j]%b==0)
			{
				System.out.println("The Module numbers are :"+a[j]);
			}
		}
			
		
		
	}
}
