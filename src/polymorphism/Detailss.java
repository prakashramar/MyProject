package polymorphism;

class Studen{
	public void Student(int rollno)
	{
		System.out.println(rollno);
	}
	public void Student(String name)
	{
		System.out.println(name);
	}
	public void Student(int rollno,String name)
	{
		System.out.println(rollno+name);
	}
}

public class Detailss {

	public static void main(String[] args) {
		Studen s=new Studen();
		s.Student(1234);
		s.Student("Ramkumar");
		s.Student(123, "Prakash");
	}

}
