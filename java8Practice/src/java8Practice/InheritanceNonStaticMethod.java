package java8Practice;

class Parent2 {
    void staticMethod() {
        System.out.println("Non static method in Parent");
    }
}

class Child2 extends Parent2 {
    void staticMethod() {
        System.out.println("Non static method in Child");
    }
}

public class InheritanceNonStaticMethod {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.staticMethod(); // Calls the static method in Parent
        
        //Child2.staticMethod();
        //Parent2.staticMethod();
    }
}
