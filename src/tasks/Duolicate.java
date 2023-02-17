package tasks;
import java.util.Scanner;
public class Duolicate 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=s.nextLine();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			int count=0;
			char a=str.charAt(1);
			char b=str.charAt(2);
			
			for(j=0;j)

			if(a==b)
			{
				count++;
				if(count>0)
				{
					System.out.println(a);
				}
				
			}
		}
	}
}




