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
		System.out.println("inside non static method"+num2);
	}

	public static void main(String args[]) {
		System.out.println("Inside main method");
		StaticMethod.method();
		StaticMethod sm =new StaticMethod();
		System.out.println(num);
		sm.nonStaticMethod();
		
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
