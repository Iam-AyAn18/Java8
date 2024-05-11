package java8Practice;

class A {
    int x = 10;
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    int x = 20;
    void display() {
        System.out.println("B");
    }
}

public class demo {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.x);
        obj.display();
    }
}
