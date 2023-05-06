package org.example.Important;

public class ExampleFinalize {
    public static void main(String[] args) {
        /*String s = new String("hi");
        s=null;
        System.gc();
        System.out.println("Main method agter calling gc..");
        //The object which is eligible for Garbage Collection,
        //that object’s corresponding class finalize method is going to be executed*/

        ExampleFinalize exampleFinalize = new ExampleFinalize();
        exampleFinalize.finalize();
        exampleFinalize = null;


        System.gc();
        System.out.println("Main method agter calling gc..");
    }

    public void finalize() {
        System.out.println("Inside the finalze...");
    }
}
