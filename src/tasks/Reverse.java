package tasks;
import java.util.Scanner;
public class Reverse 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=s.nextLine();
		
		String str1=" ";
		char ch;
		
		
		
		int a=str.length();
		System.out.println("String Length :" + a);
		
		
		for(int i=0;i<a;i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
			
			System.out.print(str1);
		}
	}

}
