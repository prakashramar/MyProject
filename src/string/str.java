package string;

import java.util.Scanner;
public class str
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the word");
		String a=s.nextLine();
		char c;
		
		for(int b=a.length()-1;b>=0;b--)
		{
			System.out.print(a.charAt(b));
		}
		
	}

}
