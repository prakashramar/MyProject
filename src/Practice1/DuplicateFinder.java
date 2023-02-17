package Practice1;

public class DuplicateFinder {

	public static void main(String[] args) {
		String s="Great responsibility";
		int count = 0;
		
		char String[]=s.toCharArray();
		
		System.out.println("Duplicate characteres are : ");
		for(int i=0;i<String.length;i++)
		{
			for(int j=i+1;j<String.length;j++)
			{
				count=1;
				if(String[i]==String[j] && String[i]!=' ')
				{
					count++;
					String[j]='0';
				}
			}
			
			if(count>1 && String[i]!='0')
			{
				System.out.println(String[i]);
			}
		}
	}

}
