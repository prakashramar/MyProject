package practice;

class Sathya
{
	int a=5;
	int b=10;
	int c;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
}

public class VariablesTask {

	public static void main(String[] args) {
		
			Sathya obj1=new Sathya();
			obj1.add();
			int z=obj1.a;
		    System.out.println(z);
	}
}
