package array;

public class FindThePositiveNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {-10,20,-30,0,50};
		
		
		int zcount=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			int ncount=0;
			if(a[i]<0)
			{
				System.out.println("Negative : "+a[i]);
				ncount ++;
			}
			System.out.println(ncount);
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			int pcount=0;
			if(a[i]>0)
		
			{
				System.out.println("Positive : "+a[i]);
				pcount ++;
			}
			
			System.out.println(pcount);
		}
				
	}

}
