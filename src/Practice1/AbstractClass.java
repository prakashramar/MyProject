package Practice1;

abstract class Bike
{
	public abstract void run();
}
class Honda extends Bike
{

	public void run() {
		System.out.println("Hai Dude");
	}
	
}



public class AbstractClass {

	public static void main(String[] args) {

			Bike b=new Honda();
			b.run();
			
	}

}
