package practice;

abstract class Method
{
	public abstract void a_method();
	Method()
	{
		System.out.println("This is a constructor of abstract class");
	}
	public void method()
	{
		System.out.println("This is a normal method of abstract class");
	}
}

class A extends Method
{

	@Override
	public void a_method() {
		System.out.println("This is abstract method");
	}
	
}

public class AbstractTask {

	public static void main(String[] args) {
		
		A obj1=new A();
		obj1.a_method();
		obj1.method();
	}

}
