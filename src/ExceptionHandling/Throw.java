package ExceptionHandling;

import java.sql.SQLException;

class A
{
	public static void add()
	{
		throw new ArithmeticException("new");
	}
	public static void sub()throws SQLException
	{
		throw new SQLException("old");
	}
}



public class Throw {

	public static void main(String[] args) {
		A obj1=new A();
		obj1.add();
		obj1.sub();
	
	}

}
