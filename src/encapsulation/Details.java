package encapsulation;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=s.nextLine();
		System.out.println("Enter the rollno");
		int rollno=s.nextInt();
		
		Details1 d=new Details1();
		d.setname(name);
		d.setrollno(rollno);
		
		String a=d.getadd();
		int b=d.getno();
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
