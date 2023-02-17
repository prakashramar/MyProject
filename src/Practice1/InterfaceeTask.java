package Practice1;
//import java.util.Scanner;

interface AdvancedArithmetic
{
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
	
	@Override
	public int divisor_sum(int n) {
	//	Scanner s=new Scanner(System.in);
	//	System.out.println("Enter the input");
	//	int input=s.nextInt();
		int divi=0;
		
		for(int i=1;i<=n;i++)
		{
			int divisor=n/i;
			divi=divisor+divi;
		}
		return divi;
		
	}
	
}

public class InterfaceeTask {

	public static void main(String[] args) {
		MyCalculator obj1=new MyCalculator();
		//obj1.divisor_sum(6);
		System.out.println(obj1.divisor_sum(6));
	}

}
