package practice;

class Name
{
	public void cal(int a,char r)
	{
		System.out.println(a,r);
	}
	public void cal(char r,int a)
	{
		System.out.println('r',a);
	}
}

public class MethodsTask {

	public static void main(String[] args) {
		
		Name obj1=new Name();
		obj1.cal(2,'R');
		obj1.cal('R',4);
		
	}

}
