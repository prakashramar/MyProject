package string;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=s.nextLine();
		System.out.println(name);
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
