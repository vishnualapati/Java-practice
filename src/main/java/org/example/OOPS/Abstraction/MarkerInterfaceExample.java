package org.example.OOPS.Abstraction;

class A implements Cloneable {
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class MarkerInterfaceExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(2,5);
        System.out.println(a.a + " "+ a.b);
        a.a = 12;

        A a1;
        a1 = (A) a.clone();
        System.out.println(a1.a + " "+ a1.b);


    }
}
