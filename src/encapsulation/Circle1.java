package encapsulation;

public class Circle1 
{
	private String a;
	private double b;
	double area;
	
	public void setcolour(String colour)
	{
		 a=colour;
	}
	public void setradius(double d)
	{
		 b=d;
	}
	public String geta()
	{
		return a;
	}
	public double getarea()
	{
		area=3.14*b*b;
		return area;
	}
	
}
