package tasks;


class one
{
	int a=5;
	public void onee()
	{
		System.out.println();
	}
}

class two extends one
{
	int b=2;
	public void twoo()
	{
		System.out.println();
	}
}


public class Inheritpassparameters 
{

	public static void main(String[] args) 
	{
		Inheritpassparameters1 i=new Inheritpassparameters1();
		i.add(7,7);
		
		two t1=new two();
		int t2=t1.a+t1.b;
		System.out.println(t2);
	}

}
