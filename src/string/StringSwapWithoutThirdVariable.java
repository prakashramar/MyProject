package string;

public class StringSwapWithoutThirdVariable {

	public static void main(String[] args) {
		String a="Love";
		String b="You";
		System.out.println("Before Swapp : "+ a+b);
		a=a+b;
		System.out.println(a);
		b=a.substring(0,a.length()-b.length());
		System.out.println(b);
	//	System.out.println(a);
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println("After Swapp :"+ a+b);
	}

}
