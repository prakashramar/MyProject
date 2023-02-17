package inheritance;

class king
{
	int x=10;
	public void add()
	{
		System.out.println(x);
	}
}
class queen extends king
{
	int y=15;
	public void sub()
	{
		System.out.println(y);
	}
}
class minister extends queen
{
	int z=20;
	public void mul()
	{
		System.out.println(z);
	}
}


public class Single 
{

	public static void main(String[] args) 
	{
		minister zz=new minister();		
		
		int d=zz.x+zz.y+zz.z;
		System.out.println(d);
		
	}

}
