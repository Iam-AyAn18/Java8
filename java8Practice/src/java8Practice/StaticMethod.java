package java8Practice;

public class StaticMethod {

	static int num;
	int num2;

	StaticMethod() {
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	void nonStaticMethod() {
		num2++;
		StaticMethod.method();
	}

	public static void main(String args[]) {
		System.out.println("Inside main method");
		StaticMethod.method();
		new StaticMethod();
		System.out.println(num);
	}

	static void method() {
		System.out.println("Inside static method");
		num++;
	}

	static {
		num++;
		System.out.println(StaticMethod.num);
		System.out.println("Inside the static block");
	}
}
