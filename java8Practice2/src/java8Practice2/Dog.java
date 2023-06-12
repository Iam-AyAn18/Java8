package java8Practice2;

public class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Dog Constructor");
	}

	public static void main(String[] args) {
		Animal D = new Dog();
	}
}
