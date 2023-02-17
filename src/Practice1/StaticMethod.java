package Practice1;

public class StaticMethod {

	public static void main(String[] args) {

		StaticMethod s=new StaticMethod();
			
			add();
			s.sub();
			s.mul();
			
			
		
		}
	public static void add()
	{
		int a=10;int b=5;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=10;int b=5;
		int d=a-b;
		System.out.println(d);
	}
	static void mul()
	{
		int s=2;
		int t=2;
		int u=s*t;
		System.out.println(u);
		
	}

}
