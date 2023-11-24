package java8Practice;

public class StaticMethod {

	static int num;
	int num2;

	StaticMethod() {//while object creation
		System.out.println("Inside the constructor");
	}

	{//before constructor
		System.out.println("Inside the non static block");
	}

	void nonStaticMethod() {
		num2++;
		System.out.println("inside non static method"+num2);
	}

	public static void main(String args[]) {//second
		System.out.println("Inside main method");
		StaticMethod.method();//call for static method
		StaticMethod sm =new StaticMethod();
		System.out.println(num);
		sm.nonStaticMethod();//call for non static method
		
	}

	static void method() {
		System.out.println("Inside static method");
		num++;
	}

	static {//first
		num++;
		System.out.println(StaticMethod.num);
		System.out.println("Inside the static block");
	}
}
