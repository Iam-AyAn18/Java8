package java8Practice;

class Parent {
	static void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
	static void staticMethod() {
        System.out.println("Static method in Child");
    }
}

public class InheritanceStaticMethod {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod(); // Calls the static method in Parent
        
        Child.staticMethod();
        Parent.staticMethod();
    }
}
