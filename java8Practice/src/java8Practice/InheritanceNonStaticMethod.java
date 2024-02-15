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
        p.staticMethod(); // Calls the static method in child
        
        Parent2 p1 = new Parent2();
        p1.staticMethod(); // Calls the static method in parent
        
        //Child2.staticMethod();
        //Parent2.staticMethod();
    }
}
