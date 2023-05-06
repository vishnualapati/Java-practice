package org.example.Important;

public class ExampleSingleton {

    public static ExampleSingleton instance = null;

    String s;
    private ExampleSingleton() {
        s="In constructor....";
    }

    public static ExampleSingleton getInstance() {
        if(instance == null) {
            instance = new ExampleSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        ExampleSingleton exampleSingleton = ExampleSingleton.getInstance();

        ExampleSingleton exampleSingleton1 = ExampleSingleton.getInstance();

        ExampleSingleton exampleSingleton2 = ExampleSingleton.getInstance();
        exampleSingleton2.s = "initialising the value";

        System.out.println(exampleSingleton2.s);
        System.out.println(exampleSingleton.s);
        System.out.println(exampleSingleton1.hashCode());
        System.out.println(exampleSingleton.hashCode());
    }
}
