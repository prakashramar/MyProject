package encapsulation;
import java.util.Scanner;

public class AtmTask {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
			AtmTask1 obj1=new AtmTask1();
			
			obj1.setAccno(12345);
			obj1.setName("Prakash");
			obj1.setPassword(9943);
			
			obj1.getAccno();
			obj1.getName();
			obj1.getPassword();
			
		System.out.println("Welcome to ATM");
		System.out.println("Enter 1 to Insert Your Card");
			int I=s.nextInt();
			
			if(I==1)
			{
				int option;
				int Damount=0;
			do {
				System.out.println("Do You Want To 1.Deposit 2.CheckBalance 3.Withdraw");
				option=s.nextInt();
				
				switch(option)
				{
					case 1:
				System.out.println("Enter the Accno");
				int AccnD=s.nextInt();
				if(AccnD==obj1.getAccno())
				{
					System.out.println("Enter the password");
					int pwd=s.nextInt();
					if(obj1.getPassword()==pwd)
					{
						System.out.println("Enter the amount to deposit");
						int amount=s.nextInt();
						Damount=amount+Damount;
						System.out.println("SUCCESSFULLY DEPOSITED :"+Damount);
					}
					else {
						System.out.println("Wrong Password");
						}
				}
				else {
					System.out.println("Wrong AccountNumber");
					}
				break;
				
				
					case 2: 
						
				System.out.println("Enter the Accno");
				int AccnB=s.nextInt();
				if(obj1.getAccno()==AccnB)
				{
					System.out.println("Enter the password");
					int pwB=s.nextInt();
					if(obj1.getPassword()==pwB)
					{
						System.out.println("Your Balance is :"+Damount);
					}
					
					else {
						System.out.println("Wrong Password");
						}
				}
				else {
					System.out.println("Wrong AccountNumber");
					}
				break;
				
					case 3:
			
				System.out.println("Enter the Accno");
				int AccnW=s.nextInt();
				if(obj1.getAccno()==AccnW)
				{
					System.out.println("Enter the password");
					int pwW=s.nextInt();
					if(obj1.getPassword()==pwW)
					{
						System.out.println("Enter the withdrawalAmount");
						int withdrawalAmount=s.nextInt();
						System.out.println("COLLECT YOUR CASH");
						int RemainingBalance=Damount-withdrawalAmount;
						System.out.println("Your Remaining Balance is :"+RemainingBalance);	
					}
					else {
						System.out.println("Wrong Password");
					}
				}
				else {
					System.out.println("Wrong AccountNumber");
					}
				break;
			}
				
		}while(option<=3);
	}
			else {
				System.out.println("Invalid INPUT");
			}
		
	}

}
