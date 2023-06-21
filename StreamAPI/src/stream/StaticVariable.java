package stream;

public class StaticVariable {
    public static int counter=0;

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        StaticVariable.counter = 5; // Modify counter through obj1
        System.out.println(obj2.counter); // Access counter through obj2, the value will be 5
    }
}
