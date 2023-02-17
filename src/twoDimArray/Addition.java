package twoDimArray;

import java.util.Arrays;

public class Addition 
{

	public static void main(String[] args) 
	{
		
		int a1[][]= {{1,2},{3,4}};
		int b1[][]= {{5,6},{7,8}};
		int ans;
		
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<b1.length;j++)
			{
				ans=a1[i][j]+b1[i][j];
				System.out.println(ans);
				System.out.println(Arrays.toString(a1));
			}
		}
		
		
		
	}

}
