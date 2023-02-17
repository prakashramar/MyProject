package array;

public class ValuebasedArray 
{
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5};
		int add=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			add=add+a[i];
			
		}
		System.out.println(add);
	}

}
