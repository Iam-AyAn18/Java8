package java8Practice;

public class StaticMethod {
	
	static int num=9;
	public StaticMethod() {
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("Inside the non static block");
	}
	
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		StaticMethod.method();
		new StaticMethod();
		System.out.println(num);
	}
	
	static void method()
	{
		System.out.println("Inside static method");
	}

	static {
		num++;
		System.out.println(StaticMethod.num);
		System.out.println("Inside the static block");
	}
}
