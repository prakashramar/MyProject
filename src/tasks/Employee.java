package tasks;

import java.util.Scanner;

public class Employee 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age of The Employee");
		int Age=s.nextInt();
	
		System.out.println("Enter the Working Days of the Employee");
		int w=s.nextInt();
		
		
		
		Employee1 e=new Employee1();
		
		e.setSalary(Age,w);

		
		System.out.println(e.getsalary());
	}

}
