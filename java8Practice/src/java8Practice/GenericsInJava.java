package java8Practice;

class GenericClass<T1, T2>
{
    T1 t1;
 
    T2 t2;
 
    public GenericClass(T1 t1, T2 t2)
    {
        this.t1 = t1;
 
        this.t2 = t2;
    }
 
    public void setT1(T1 t1)
    {
        this.t1 = t1;
    }
 
    public T1 getT1()
    {
        return t1;
    }
 
    public void setT2(T2 t2)
    {
        this.t2 = t2;
    }
 
    public T2 getT2()
    {
        return t2;
    }
}
 
public class GenericsInJava
{
    public static void main(String[] args)
    {
        GenericClass<String, Integer> gen1 = new GenericClass<String, Integer>("Value of t1", new Integer(123));
 
        GenericClass<Integer, String> gen2 = new GenericClass<Integer, String>(new Integer(123), "Value of t2");
 
        System.out.println(gen1.getT1());       //Output : Value of t1
 
        System.out.println(gen1.getT2());       //Output : 123
 
        System.out.println(gen2.getT1());       //Output : 123
 
        System.out.println(gen2.getT2());       //Output : Value of t2
    }
}