package array;
import java.util.Arrays;

public class ArrayMethods 
{

	public static void main(String[] args) 
	{
		int a[]= {45,23,8,56};
		int b[]= {45,23,9,56};
		
		
		//int c[]=Arrays.copyOf(a,2);
		int d[]=Arrays.copyOfRange(a, 0, 3);
		//Arrays.sort(a);
		//System.out.println(Arrays.asList(a));
		//Arrays.fill(a, 0, 2, 10);
		//System.out.println(Arrays.binarySearch(a, 45));
		//System.out.println(Arrays.compare(a, b));
		//System.out.println(Arrays.equals(a, b));
		//System.out.println(Arrays.mismatch(a, b));
		//System.out.println(Arrays.mismatch(a, 0, 2, b, 0, 2));
		System.out.println(Arrays.toString());
		
	}

}
