package string;

import java.util.Scanner;

public class Paragraph 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter the string :");
		String p=s.nextLine();
		System.out.println(p);
		
		int a=p.length();
		System.out.println("The length of String is :" + a);
		
		System.out.println("The String Without Spaces :" + p.replace(" ","").length());
		
		for(int b=0;b<p.length();b++)
		{
			if(!Character.isLetter(p.charAt(b)))
			{
				count++;
				
			}
			if(count==0)
			{
				System.out.println("no spl scar found");
			}
			else
			{
				System.out.println("total no of spl char"+ count);
			}
				
		}
	
	}
}
