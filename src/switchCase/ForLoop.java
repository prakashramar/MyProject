package switchCase;

public class ForLoop
{
	public static void main(String [] args)
	{
		int i=10;
		
		for(i=0;i<=20;i++)
		{	
			if(i==5)
			{
				System.out.println("Stop");
				continue;
			
			}
			System.out.println(i);
		
		}
	}

}
