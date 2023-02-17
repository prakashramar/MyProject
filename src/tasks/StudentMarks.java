package tasks;

abstract class Marks
{
	public abstract double getPercentage();
}
class A extends Marks
{
	private int m1;
	private int m2;
	private int m3;
	
	public double getPercentage()
	{
		int total=m1+m2+m3;
		double getPercentage=total/3;
		return getPercentage;
	}
	A(int mark1,int mark2,int mark3)
	{
		m1=mark1;
		m2=mark2;
		m3=mark3;
	}
}
class B extends Marks
{
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	
	public double getPercentage()
	{
		int total=m1+m2+m3+m4;
		double getPercentage=total/4;
		return getPercentage;
	}
	B(int mark1,int mark2,int mark3,int mark4)
	{
		m1=mark1;
		m2=mark2;
		m3=mark3;
		m4=mark4;
	}
}
public class StudentMarks {

	public static void main(String[] args) {
		
		A obj1=new A(85, 85, 85);
		obj1.getPercentage();
		System.out.println(obj1.getPercentage());
		
		
		B obj2=new B(95, 95, 95, 90);
		obj2.getPercentage();
		System.out.println(obj2.getPercentage());
	}

}
