package tasks;

class member
{
	int salary=25000;
	String name="Prakash";
	int age=27;
	int phNo=1234;
	String add="T nagar Chennai";
	
	public void member()
	{
		System.out.println();
	}
	
}

class emp extends member
{
	String s1="Armor Specialist";
	public void special()
	{
		System.out.println(s1);
	}
}

class manager extends member
{
	String s2="Armory";
	public void special()
	{
		System.out.println(s2);
	}
}



public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		emp ee=new emp();
		String name1=ee.name;
		int age1=ee.age;
		int phNo1=ee.phNo;
		String add1=ee.add;
		int salary1=ee.salary;
		String m=ee.s1;
		
		System.out.println(name1);
		System.out.println(age1);
		System.out.println(phNo1);
		System.out.println(add1);
		System.out.println(salary1);
		System.out.println(m);
		
		
		
		manager mm=new manager();
		String name2=mm.name;
		int age2=mm.age;
		int phNo2=mm.phNo;
		String add2=mm.add;
		int salary2=mm.salary;
		String n=mm.s2;
		
		System.out.println(name2);
		System.out.println(age2);
		System.out.println(phNo2);
		System.out.println(add2);
		System.out.println(salary2);
		System.out.println(n);
		
	}

}
