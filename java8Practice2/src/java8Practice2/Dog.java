package java8Practice2;

public class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Dog Constructor");
	}

	public static void main(String[] args) {
		Animal A = new Dog();
		Dog D = new Dog();
		Animal A2 = new Animal();
		//Dog D2 = new Animal(); error
	}
}
