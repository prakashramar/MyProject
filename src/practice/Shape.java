package practice;

class Shapee
{
	public void sshapee()
	{
		System.out.println("This is Shape");
	}
}
class Rectangle extends Shapee
{
	public void rrectangle()
	{
		System.out.println("This is Rectangle");
	}
}
class Square extends Rectangle
{
	public void ssquare()
	{
		System.out.println("Square is a Rectangle");
	}
}
class Circle extends Shapee
{
	public void ccircle()
	{
		System.out.println("This is Circle");
	}
}
public class Shape {

	public static void main(String[] args) {
		
		Rectangle obj1=new Rectangle();
		obj1.sshapee();
		obj1.rrectangle();
	}

}
