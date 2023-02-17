package tasks;
import java.util.Scanner;

public class AddingOfTwoNumbersUsingDoWhile {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	
		String y;
		do
		{	
			System.out.println("Enter the no 1");
			int num1=s.nextInt();
			System.out.println("Enter the no 2");
			int num2=s.nextInt();
			
			int Total=num1+num2;
			System.out.println(Total);
			
			System.out.println("Dou want to continue");
			y=s.nextLine();
			y=s.nextLine();
			
			
		}while(y.equals("Yes"));
		
		
		
	}

}
