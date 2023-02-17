package tasks;

abstract class Marks
{
	public abstract double getPercentage();
}
class StudentA extends Marks
{	
	int a,b,c;
	
	StudentA(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public double getPercentage()
	{
		double per1=(a+b+c)/3;
		return per1;
	}
}
class StudentB extends Marks
{	
	int a,b,c,d;
	
	StudentB(int a,int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	@Override
	public double getPercentage() 
	{
		double per2=(a+b+c+d)/4;
		return per2;
	}
}

public class Percentage
{
	public static void main(String[] args) 
	{
		StudentA obj1=new StudentA(85,85,85);
		System.out.println(obj1.getPercentage());
		
		StudentB obj2=new StudentB(90,90,90,90);
		System.out.println(obj2.getPercentage());
		
	}

}
