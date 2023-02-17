package inheritance;


class underGraduate extends Degree
{
	public void graduate()
	{
		System.out.println("I am an Undergraduate");
	}
}

class postGraduate extends Degree
{
	public void graduate()
	{
		System.out.println("I am an Postgraduate");
	}
}


public class Degree 
{

	public static void main(String[] args) 
	{
		Degree dd=new Degree();
		dd.getDegree();
		postGraduate pp=new postGraduate();
		pp.graduate();
		underGraduate uu=new underGraduate();
		uu.graduate();
	}
		public void getDegree()
		{
			System.out.println("I got a Degree");	
		}
}
