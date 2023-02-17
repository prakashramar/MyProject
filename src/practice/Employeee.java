package practice;

public class Employeee 
{

	public static void main(String[] args) 
	{
		String empName="Rajini";
		int  e=12;
		
		String empName1="Kamal";
		int e1=22;
		
		
		Employeee1 m=new Employeee1();
		m.setempName("Rajini");
		m.setEmpId(12);
		
		String x=m.getempName();
		int y=m.getEmpid();
		
		System.out.println(x);
		System.out.println(y);
		
		Employeee1 m1=new Employeee1();
		m1.setempName("Kamal");
		m1.setEmpId(22);
		
		String x1=m1.getempName();
		int y1=m1.getEmpid();
		
		System.out.println(x1);
		System.out.println(y1);
		
		
	}

}
