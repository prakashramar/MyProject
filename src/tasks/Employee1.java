package tasks;

public class Employee1 
{
	private int Age1;
	private int c;
	private int salary;
	
	public void setSalary(int Age,int w)
	{
		Age1=Age;
		c=w;
		
		if(Age1>20 && Age1<30)
		{
			 salary =400*c;
		}
		else if(Age1>31 && Age1<40)
		{
			 salary =600*c;
		}
		else if(Age1>41 && Age1<50)
		{
			salary =800*c;
		}
	}
	
	
	
	public int getsalary()
	{
		
		return salary;
	}
}