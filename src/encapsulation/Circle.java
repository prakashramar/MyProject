package encapsulation;

import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the colour of the circle");
		String colour=s.nextLine();
		System.out.println("Enter the radius of the circle");
		double d=s.nextDouble();
		
		//double d=2.0;
		//String colour="blue";
		

		Circle1 c=new Circle1();
		c.setcolour(colour);
		c.setradius(d);
		
		String x=c.geta();
		double y=c.getarea();
		
		System.out.println(x);
		System.out.println(y);
	}

}
