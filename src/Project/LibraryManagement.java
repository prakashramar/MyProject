package Project;
import java.util.Scanner;

public class LibraryManagement {

		private static String adname="PRAKASH";
		private static int adpass=9943;
		
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("Welcome to PRAKASH library");
		
		System.out.println("Are you a 1.STUDENT 2.STAFF");
		int option=s.nextInt();
		
		switch(option)
		{
		case 1://STUDENT
			System.out.println("Do You want to 1.Register or 2.Login");
			int opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("WELCOME TO REGISTER");
				System.out.println("Enter your name :");
				
				String name=s.nextLine();
				
				System.out.println("Enter your rollno :");
				int rollno=s.nextInt();
				
				System.out.println("Enter your college :");
				String college=s.nextLine();
				
				System.out.println("Enter your department :");
				String department=s.nextLine();
				
				System.out.println("Create your password :");
				int password=s.nextInt();
				
				System.out.println("SUCCESSFULLY CREATED");
			}
			else if(opt==2)
			{
				System.out.println("Enter your rollno :");
				int rollno=s.nextInt();
				
				System.out.println("Enter your password :");
				int password=s.nextInt();
				
				System.out.println("LOGIN SUCCESSFULLY");
				
				System.out.println("Enter your Department");
				int Department=s.nextInt();
				
				
				switch(Department)
				{
					case 1://ECE
						System.out.println("1.Ele Circuits 2.Sig Sys");
						System.out.println("Purchased Successfully");
						break;
						
					case 2://MECH	
						System.out.println("1.Flu Mecha 2.Catia");
						System.out.println("Purchased Successfully");
						break;
						
					case 3://CSE
						System.out.println("1.Ds 2.Fop");
						System.out.println("Purchased Successfully");
						break;
				}
			}
			else {
				System.out.println("INVALID");
			}break;
		case 2://(STAFF)
			
			System.out.println("Enter Admin Login");
			String addname=s.nextLine();
			if(addname==adname) 
			{
				System.out.println("Enter Admin Password");
				int adppass=s.nextInt();
				if(adpass==adppass)
				{
					System.out.println("Student Details are :");
					System.out.println("");
				}
			}	break;
		}//SWITCH		
	}		
}
