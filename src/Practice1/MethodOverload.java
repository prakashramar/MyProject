package Practice1;

class A
{
	public void over()
	{
		System.out.println("hello");
	}
	public void over(String a)
	{
		System.out.println("hai");
	}
	public void over(int b)
	{
		System.out.println(2);
	}
}
class B extends A
{
	public void over(String a)
	{
		System.out.println(a);
	}
	public void over(int b)
	{
		System.out.println(b);
	}
	public void task()
	{
		System.out.println("You R welcome");
	}
}


public class MethodOverload {

	public static void main(String[] args) {
		B obj1=new B();
		obj1.over("Prakash");
		obj1.over(24);
		obj1.task();
	}

}
