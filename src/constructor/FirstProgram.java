package constructor;

public class FirstProgram 
{
	int a,b;
	public static void main(String[] args) 
	{
		FirstProgram f=new FirstProgram();
	}

	FirstProgram(int a,int b)
	{
		System.out.println("Two Arguments");
	}
	
	FirstProgram()
	{
		this(5);
		System.out.println("No Argument");
	}
	
	FirstProgram(int a)
	{
		System.out.println("One Argument");
	}
}
