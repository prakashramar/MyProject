package string;

import java.util.Arrays;

public class Reverse 
{

	public static void main(String[] args) 
	{
		String s1="Xml";
		String s2="lmx";
		
		String s3=s1.toLowerCase();
		System.out.println(s3);
		
		char []s4=s2.toCharArray();
		char []s5=s3.toCharArray();
		
		Arrays.sort(s4);
		String t4=new String(s4);
		
		Arrays.sort(s5);
		String t5=new String(s5);
		
		System.out.println(t4);
		System.out.println(t5);

		if(t4.contentEquals(t5))
		{
		System.out.println("It is Equal");
		}
	}

}
