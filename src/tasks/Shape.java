package tasks;



class Shap
{
	public void shape()
	{
		System.out.println("This is Shape");
	}
}

class Rectangle extends Shap
{
	public void rectangle()
	{
		System.out.println("This is rectangular shape");
	}
}
class Square extends Rectangle
{
	public void square()
	{
		System.out.println("Square is a rectangle");
	}
}

class Circle extends Shap
{
	public void circle()
	{
		System.out.println("This is Circular Shape");
	}
}



public class Shape
{

	public static void main(String[] args) 
	{
		Square s=new Square();
		s.shape();
		s.rectangle();	
	}

}
