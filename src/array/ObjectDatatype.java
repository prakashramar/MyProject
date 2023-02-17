package array;
import java.util.Scanner;
public class ObjectDatatype 
{

	public static void main(String[] args) 
	{
		/*Object a[]= {"uniq",'u',12,true,34.89};
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=s.nextInt();
		
		Object a[]={n};
		
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter the Value : ");
			a[i]=s.next();
			System.out.println(a[i]);
		}
	}

}
