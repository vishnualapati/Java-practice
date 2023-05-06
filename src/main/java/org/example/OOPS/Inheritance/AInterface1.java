package org.example.OOPS.Inheritance;

public interface AInterface1 {

    void print();

    default void work() {
        System.out.println("Doing some work..");
    }

    public static void learn() {
        System.out.println("learning..");
    }

}
