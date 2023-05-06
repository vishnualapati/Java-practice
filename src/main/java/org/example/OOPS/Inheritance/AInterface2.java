package org.example.OOPS.Inheritance;

public class AInterface2 implements AInterface1, AInterface{
    public static void main(String[] args) {
        AInterface2 aInterface2 = new AInterface2();
        aInterface2.print();
        AInterface.learn();
        aInterface2.work();
    }

    @Override
    public void print() {
        System.out.println("Printing something...");
    }

    @Override
    public void work() {
//        AInterface1.super.work();
        System.out.println("In implementation class...");
    }
}
