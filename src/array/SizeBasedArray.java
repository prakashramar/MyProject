package array;
import java.util.Scanner;

public class SizeBasedArray {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int n=s.nextInt();
		
		int a []=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			int get=n;
			System.out.println("Enter value : ");
			a[i]=s.nextInt();
			sum=sum+a[i];
			
			
		}
		System.out.println("Addition : " +sum);

	}
}
