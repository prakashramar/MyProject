package Object;

public class ObjectMethods {

	public static void main(String[] args) 
	{
		ObjectMethods o=new ObjectMethods();
		try{
			o.name();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println(o.getClass());
		System.out.println(o.hashCode());
		System.out.println(o.toString());
		System.out.println(o.equals(o));
	}
	
	public void name() throws CloneNotSupportedException
	{
		ObjectMethods o=new ObjectMethods();
		o.clone();
	}
}
